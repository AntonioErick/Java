
public class strings {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG      ";
		
		String s01 = original.toLowerCase();//converte a string em letras minusculas
		String s02 = original.toUpperCase();//converte a string em letras maisculas
		String s03 = original.trim();//elimina espaços extras nos cantos da string
		String s04 = original.substring(2);//formara uma nova string apartir do numero de caracteres especificado
		String s05 = original.substring(2, 9);//formara uma nova string apartir do numero de caracteres especificado, porem, com um limite
		String s06 = original.replace('a', 'x');//substitui um caractere especifico por outro
		int i = original.indexOf("bc");//primeira ocorrencia do BC
		int j = original.lastIndexOf("bc");//ultima ocorrencia do BC
		
		System.out.println("Original: - "+original+"-");
		System.out.println("toLowerCase: -"+s01+"-");
		System.out.println("toUpperCase: -"+s02+"-");
		System.out.println("trim: -"+s03+"-");
		System.out.println("substring(2): -"+s04+"-");
		System.out.println("substring(2, 9): -"+s05+"-");
		System.out.println("replace(a, x): -"+s06+"-");
		System.out.println("Index of 'bc': "+i);
		System.out.println("Last index of 'bc': "+j);

	}

}
