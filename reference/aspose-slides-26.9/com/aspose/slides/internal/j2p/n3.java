package com.aspose.slides.internal.j2p;

import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.j1;

public class n3 extends j1 implements f2 {
   private boolean n5;

   public n3(String var1, String var2, XmlDocument var3, boolean var4) {
      super(var1, var2, var3);
      this.n5 = var4;
   }

   public final boolean n5() {
      return this.n5;
   }

   @Override
   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(com.aspose.slides.internal.l7h.a5 var1, int var2, n5 var3) {
      if (this.n5()) {
         if (var2 == 2) {
            var1.n5('\n');
         }

         var1.n5("<?");
         var1.n5(this.getName());
         if (this.getValue() != null && this.getValue().length() > 0) {
            var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{" ", this.getValue()}));
         }

         var1.n5("?>");
         if (var2 == 0) {
            var1.n5('\n');
         }
      }
   }

   @Override
   public final void n5(com.aspose.slides.internal.o8m.f2 var1, int var2, n5 var3) {
      if (this.n5()) {
         com.aspose.slides.internal.l7h.u6 var4 = new com.aspose.slides.internal.l7h.u6(false);
         if (var2 == 2) {
            byte[] var5 = var4.u3("(char) 10");
            var1.n5(var5, 0, var5.length, var5, 0);
         }

         byte[] var6 = var4.u3("<?");
         var1.n5(var6, 0, var6.length, var6, 0);
         var6 = var4.u3(this.getName());
         var1.n5(var6, 0, var6.length, var6, 0);
         if (this.getValue() != null && this.getValue().length() > 0) {
            var6 = var4.u3(com.aspose.slides.ms.System.d1.n5(new String[]{" ", this.getValue()}));
            var1.n5(var6, 0, var6.length, var6, 0);
         }

         var6 = var4.u3("?>");
         var1.n5(var6, 0, var6.length, var6, 0);
         if (var2 == 0) {
            var6 = var4.u3("(char) 10");
            var1.n5(var6, 0, var6.length, var6, 0);
         }
      }
   }
}
