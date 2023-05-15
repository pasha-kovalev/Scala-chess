function init() {
    const isWhite = true
    initNumbers(isWhite)
    initLetters(isWhite)
    initPieces(isWhite)

}

function initNumbers(isWhite) {
    let counter = isWhite ? 8 : 1
    const counterFn = isWhite ? () => counter-- : () => counter++

    document.querySelectorAll('.number').forEach(
        el => {
            el.innerHTML = counter.toString()
            counterFn()
        }
    )
}

function initKingQueen(isWhite) {
    const queenIndex = isWhite ? 3 : 4
    const kingIndex = isWhite ? 4 : 3

    const rows = document.querySelectorAll('.row')
    const row0Pieces = rows[0].querySelectorAll('.piece')
    const row7Pieces = rows[7].querySelectorAll('.piece')

    row0Pieces[queenIndex].classList.add('queen')
    row7Pieces[queenIndex].classList.add('queen')

    row0Pieces[kingIndex].classList.add('king')
    row7Pieces[kingIndex].classList.add('king')
}

function initLetters(isWhite) {
    const intToChar = (int) => {
        return String.fromCharCode(int);
    };

    const charToInt = (char) => {
        return char.charCodeAt(0);
    };

    let counter = isWhite ? charToInt('a') : charToInt('h')
    const counterFn = isWhite ? () => counter++ : () => counter--

    document.querySelectorAll('.letter').forEach(
        el => {
            el.innerHTML = intToChar(counter)
            counterFn()
        }
    )
}

function initPieces(isWhite) {
    const rows = document.querySelectorAll('.row')
    const r0r1Color = isWhite ? "black" : "white"
    const r6r7Color = isWhite ? "white" : "black"

    rows[0].querySelectorAll('.piece').forEach(rook => rook.classList.add(r0r1Color))
    rows[1].querySelectorAll('.piece').forEach(rook => rook.classList.add(r0r1Color))

    rows[6].querySelectorAll('.piece').forEach(rook => rook.classList.add(r6r7Color))
    rows[7].querySelectorAll('.piece').forEach(rook => rook.classList.add(r6r7Color))
    initKingQueen(isWhite)
}

init()