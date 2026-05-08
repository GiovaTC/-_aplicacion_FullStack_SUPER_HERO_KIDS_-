const API = "http://localhost:8080/api/heroes";

async function listarHeroes() {

    const response = await fetch(API);
    const data = await response.json();

    let tabla = "";

    data.forEach(heroe => {

        tabla += `
            <tr>
                <td>${heroe.id}</td>
                <td>${heroe.nombre}</td>
                <td>${heroe.poder}</td>
                <td>${heroe.nivel}</td>
                <td>${heroe.universo}</td>

                <td>
                    <button
                        class="btn btn-danger"
                        onclick="eliminarHeroe(${heroe.id})">

                        Eliminar

                    </button>
                </td>
            </tr>
        `;
    });

    document.getElementById("tablaHeroes").innerHTML = tabla;
}

async function guardarHeroe() {

    const heroe = {

        nombre: document.getElementById("nombre").value,
        poder: document.getElementById("poder").value,
        nivel: document.getElementById("nivel").value,
        universo: document.getElementById("universo").value
    };

    await fetch(API, {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(heroe)
    });

    listarHeroes();
}

async function eliminarHeroe(id) {

    await fetch(`${API}/${id}`, {
        method: "DELETE"
    });

    listarHeroes();
}

listarHeroes();