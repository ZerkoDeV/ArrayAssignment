
public class AsciiToDigit {

	public static void main(String[] args) {
		p("Converting ASCII number to digits");
        var a = 0b01100001; // ASCII number.
        var b = 0b00001111; // bitmask to convert ASCII numbers to decimal
        var c = a & b; // Apply the mask to var c.
        p(c); // Printing c.
        p("Converting digits to ASCII numbers");
        var d = 0b00000001; // Binary number
        var e = 0b00110000; // Bitmask to convert decimal to ASCII numbers
        int f = d | e; //Apply the mask to var f.
        p(f); // Printing f.

	}
	public static <t> void p(t text){
        System.out.println(text);
	}
}