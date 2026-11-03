package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.Xml.s2;
import com.aspose.slides.ms.System.Xml.z9;

public class t3 extends s2 {
   private final String n5;
   private final Dictionary<String, String> l6 = new Dictionary<>();

   public t3(z9 var1, String var2) {
      super(var1);
      if (com.aspose.slides.ms.System.d1.n5(var2)) {
         throw new ArgumentNullException("contentType");
      }

      this.n5 = var2;
   }

   private void k5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("prefix");
      }

      String var2 = com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ var1, this.n5});
      String var3 = com.aspose.slides.ms.System.d1.n5("http://aspose.com/2017/12/fake/namespace/for/prefix/{0}/{1}",new Object[]{ this.n5, var1});
      if (this.l6(var3) != null) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5("Uri already exists \"{0}\"", new Object[]{var3}));
      }

      if (!this.l6.containsKey(var2)) {
         this.l6.addItem(var2, var3);
      }

      this.n5(var1, var3);
   }

   @Override
   public String n5(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         return super.n5(var1);
      }

      String var2 = super.n5(var1);
      if (var2 == null) {
         this.k5(var1);
      }

      return super.n5(var1);
   }
}
