//
// This is only a SKELETON file for the 'Scrabble Score' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const score = word => {
    const letters = word.split('')
    var summ = 0,
        c
    for (let letter of letters) {
        switch (letter.toUpperCase()) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'R':
            case 'S':
            case 'T':
                c = 1
                break
            case 'D':
            case 'G':
                c = 2
                break
            case 'B':
            case 'C':
            case 'M':
            case 'P':
                c = 3
                break
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
                c = 4
                break
            case 'K':
                c = 5
                break
            case 'J':
            case 'X':
                c = 8
                break
            case 'Q':
            case 'Z':
                c = 10
                break
            default:
                c = 0
                break
        }
        summ += c
    }
    return summ
}