package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class f8y {
   private static final Dictionary<Byte, String> n5 = new Dictionary<>();

   public static byte[] n5(char var0, byte var1) {
      byte[] var2 = com.aspose.slides.internal.l7h.j5.z1().l6(new char[]{var0});
      if (!n5.containsKey(var1)) {
         return var2;
      }

      String var3 = n5.get_Item(var1);
      return com.aspose.slides.internal.l7h.j5.n5(com.aspose.slides.internal.l7h.j5.z1(), com.aspose.slides.internal.n2d.x8.n5(var3), var2);
   }

   static {
      n5.addItem((byte)0, "ISO-8859-1");
      n5.addItem((byte)77, "shift_jis");
      n5.addItem((byte)-128, "shift_jis");
      n5.addItem((byte)-127, "ks_c_5601-1987");
      n5.addItem((byte)-126, "Johab");
      n5.addItem((byte)-122, "gb2312");
      n5.addItem((byte)-120, "big5");
      n5.addItem((byte)-95, "windows-1253");
      n5.addItem((byte)-94, "iso-8859-9");
      n5.addItem((byte)-93, "windows-1258");
      n5.addItem((byte)-79, "windows-1255");
      n5.addItem((byte)-78, "windows-1256");
      n5.addItem((byte)-70, "windows-1257");
      n5.addItem((byte)-52, "windows-1251");
      n5.addItem((byte)-34, "windows-874");
      n5.addItem((byte)-18, "windows-1250");
   }
}
