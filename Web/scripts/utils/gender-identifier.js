export class GenderIdentifier {

    static autoReplace(str) {
        const pronounPattern = /\[([^\/]*)\/([^\/]*)\/([^\]]*)\@(\d)]/g;

        return str.replace(pronounPattern, (matchDaRegex, group1, group2, group3, group4) => {
            let pronouns = [group1, group2, group3]
            return pronouns[group4 ?? 1]
        });
    }

    static manualReplace(str, gender) {
        const pronounPattern = /\[([^\/]*)\/([^\/]*)\/([^\]]*)]/g;
        console.log(gender);
        return str.replace(pronounPattern, `$${gender + 1}`);
    }

}