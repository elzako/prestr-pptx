package com.aspose.slides.internal.b8c;

public class j9 extends t1 {
   @Override
   public int n3() {
      return 40;
   }

   @Override
   public RuntimeException n5(String var1, com.aspose.slides.ms.System.Xml.z9 var2, com.aspose.slides.ms.System.Xml.a3 var3, Object[] var4) {
      var4[0] = null;
      String[] var5 = new String[]{var1};
      RuntimeException var6 = this.h0().n5(var5, this);
      var1 = var5[0];
      if (var6 != null) {
         return var6;
      }

      com.aspose.slides.ms.System.c4 var7 = new com.aspose.slides.ms.System.c4();
      com.aspose.slides.ms.System.c4[] var8 = new com.aspose.slides.ms.System.c4[]{var7};
      var6 = com.aspose.slides.ms.System.Xml.f4.l6(var1, var8);
      var7 = var8[0];
      if (var6 != null) {
         return var6;
      }

      var6 = this.h0().n5(var7.l6(), this);
      if (var6 != null) {
         return var6;
      }

      var4[0] = var7.l6();
      return null;
   }
}
