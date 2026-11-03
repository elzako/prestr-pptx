package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;

class x6$n5 implements com.aspose.slides.ms.System.Xml.a3 {
   public String n5;
   public String l6;

   public x6$n5(String var1, String var2) {
      this.l6 = var2;
      this.n5 = var1;
   }

   @Override
   public final String n5(String var1) {
      return com.aspose.slides.ms.System.d1.a6(var1, this.n5) ? this.l6 : null;
   }

   @Override
   public final String l6(String var1) {
      return com.aspose.slides.ms.System.d1.a6(this.l6, var1) ? this.n5 : null;
   }

   @Override
   public final IGenericDictionary<String, String> n5(int var1) {
      Dictionary var2 = new Dictionary(1);
      var2.set_Item(this.n5, this.l6);
      return var2;
   }
}
