package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.NotImplementedException;

public class b9 implements IGenericDictionary<Integer, String> {
   private Dictionary<Integer, String> n5 = new Dictionary<>();

   public final void n5(int var1, String var2) {
      this.n5.set_Item(var1, var2);
   }

   public final boolean n5(int var1, String[] var2) {
      return this.n5.tryGetValue(var1, var2);
   }

   public final String n5(int var1) {
      Object var2 = null;
      String[] var3 = new String[]{(String)var2};
      this.n5.tryGetValue(var1, var3);
      return var3[0];
   }

   public final void l6(int var1, String var2) {
      this.n5.set_Item(var1, var2);
   }

   @Override
   public final IGenericCollection<Integer> getKeys() {
      return this.n5.getKeys();
   }

   @Override
   public final IGenericCollection<String> getValues() {
      return this.n5.getValues();
   }

   public final void n5(KeyValuePair<Integer, String> var1) {
      throw new NotImplementedException();
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   public final boolean l6(KeyValuePair<Integer, String> var1) {
      throw new NotImplementedException();
   }

   public final void n5(KeyValuePair<Integer, String>[] var1, int var2) {
      throw new NotImplementedException();
   }

   public final boolean k5(KeyValuePair<Integer, String> var1) {
      throw new NotImplementedException();
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final boolean isReadOnly() {
      throw new NotImplementedException();
   }

   public final void n5(Integer var1, String var2) {
      this.n5.set_Item(var1, var2);
   }

   public final boolean n5(Integer var1) {
      return this.n5.containsKey(var1);
   }

   public final boolean l6(Integer var1) {
      return this.n5.removeItemByKey(var1);
   }

   public final boolean n5(Integer var1, Object[] var2) {
      return this.n5(var1.intValue(), (String[])var2);
   }

   public final String k5(Integer var1) {
      return this.n5(var1.intValue());
   }

   public final void l6(Integer var1, String var2) {
      this.n5.set_Item(var1, var2);
   }

   public final void n5() {
      this.n5("101", "A");
      this.n5("341", "AE");
      this.n5("102", "B");
      this.n5("103", "C");
      this.n5("104", "D");
      this.n5("105", "E");
      this.n5("106", "F");
      this.n5("107", "G");
      this.n5("110", "H");
      this.n5("111", "I");
      this.n5("112", "J");
      this.n5("113", "K");
      this.n5("114", "L");
      this.n5("350", "Lslash");
      this.n5("115", "M");
      this.n5("116", "N");
      this.n5("117", "O");
      this.n5("352", "OE");
      this.n5("351", "Oslash");
      this.n5("120", "P");
      this.n5("121", "Q");
      this.n5("122", "R");
      this.n5("123", "S");
      this.n5("124", "T");
      this.n5("125", "U");
      this.n5("126", "V");
      this.n5("127", "W");
      this.n5("130", "X");
      this.n5("131", "Y");
      this.n5("132", "Z");
      this.n5("141", "a");
      this.n5("302", "acute");
      this.n5("361", "ae");
      this.n5("046", "ampersand");
      this.n5("136", "asciicircum");
      this.n5("176", "asciitilde");
      this.n5("052", "asterisk");
      this.n5("100", "at");
      this.n5("142", "b");
      this.n5("134", "backslash");
      this.n5("174", "bar");
      this.n5("173", "braceleft");
      this.n5("175", "braceright");
      this.n5("133", "bracketleft");
      this.n5("135", "bracketright");
      this.n5("306", "breve");
      this.n5("267", "bullet");
      this.n5("143", "c");
      this.n5("317", "caron");
      this.n5("313", "cedilla");
      this.n5("242", "cent");
      this.n5("303", "circumflex");
      this.n5("072", "colon");
      this.n5("054", "comma");
      this.n5("250", "currency");
      this.n5("144", "d");
      this.n5("262", "dagger");
      this.n5("263", "daggerdbl");
      this.n5("310", "dieresis");
      this.n5("044", "dollar");
      this.n5("307", "dotaccent");
      this.n5("365", "dotlessi");
      this.n5("145", "e");
      this.n5("070", "eight");
      this.n5("274", "ellipsis");
      this.n5("320", "emdash");
      this.n5("261", "endash");
      this.n5("075", "equal");
      this.n5("041", "exclam");
      this.n5("241", "exclamdown");
      this.n5("146", "f");
      this.n5("256", "fi");
      this.n5("065", "five");
      this.n5("257", "fl");
      this.n5("246", "florin");
      this.n5("064", "four");
      this.n5("244", "fraction");
      this.n5("147", "g");
      this.n5("373", "germandbls");
      this.n5("301", "grave");
      this.n5("076", "greater");
      this.n5("253", "guillemotleft");
      this.n5("273", "guillemotright");
      this.n5("254", "guilsinglleft");
      this.n5("255", "guilsinglright");
      this.n5("150", "h");
      this.n5("315", "hungarumlaut");
      this.n5("055", "hyphen");
      this.n5("151", "i");
      this.n5("152", "j");
      this.n5("153", "k");
      this.n5("154", "l");
      this.n5("074", "less");
      this.n5("370", "lslash");
      this.n5("155", "m");
      this.n5("305", "macron");
      this.n5("156", "n");
      this.n5("071", "nine");
      this.n5("043", "numbersign");
      this.n5("157", "o");
      this.n5("372", "oe");
      this.n5("316", "ogonek");
      this.n5("061", "one");
      this.n5("343", "ordfeminine");
      this.n5("353", "ordmasculine");
      this.n5("371", "oslash");
      this.n5("160", "p");
      this.n5("266", "paragraph");
      this.n5("050", "parenleft");
      this.n5("051", "parenright");
      this.n5("045", "percent");
      this.n5("056", "period");
      this.n5("264", "periodcentered");
      this.n5("275", "perthousand");
      this.n5("053", "plus");
      this.n5("161", "q");
      this.n5("077", "question");
      this.n5("277", "questiondown");
      this.n5("042", "quotedbl");
      this.n5("271", "quotedblbase");
      this.n5("252", "quotedblleft");
      this.n5("272", "quotedblright");
      this.n5("140", "quoteleft");
      this.n5("047", "quoteright");
      this.n5("270", "quotesinglbase");
      this.n5("251", "quotesingle");
      this.n5("162", "r");
      this.n5("312", "ring");
      this.n5("163", "s");
      this.n5("247", "section");
      this.n5("073", "semicolon");
      this.n5("067", "seven");
      this.n5("066", "six");
      this.n5("057", "slash");
      this.n5("040", "space");
      this.n5("243", "sterling");
      this.n5("164", "t");
      this.n5("063", "three");
      this.n5("304", "tilde");
      this.n5("062", "two");
      this.n5("165", "u");
      this.n5("137", "underscore");
      this.n5("166", "v");
      this.n5("167", "w");
      this.n5("170", "x");
      this.n5("171", "y");
      this.n5("245", "yen");
      this.n5("172", "z");
      this.n5("060", "zero");
   }

   protected final void n5(String var1, String var2) {
      int var3 = com.aspose.slides.ms.System.z3.l6(var1, 8);
      this.l6(var3, var2);
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<Integer, String>> iterator() {
      return this.n5.iterator();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void set_Item(Integer bridgeArg0, String bridgeArg1) {
      this.l6(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public String get_Item(Integer bridgeArg0) {
      return this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean tryGetValue(Integer bridgeArg0, Object[] bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean removeItemByKey(Integer bridgeArg0) {
      return this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean containsKey(Integer bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void addItem(Integer bridgeArg0, String bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean removeItem(KeyValuePair<Integer, String> bridgeArg0) {
      return this.k5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void copyToTArray(KeyValuePair<Integer, String>[] bridgeArg0, int bridgeArg1) {
      this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean containsItem(KeyValuePair<Integer, String> bridgeArg0) {
      return this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void addItem(KeyValuePair<Integer, String> bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
