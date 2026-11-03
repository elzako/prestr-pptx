package com.aspose.slides.ms.System.Xml;

public class c4 {
   private x7[] n5;
   private int l6;
   private int k5;
   private XmlDocument u3;
   private z9 a6;

   public c4(XmlDocument var1) {
      this.u3 = var1;
      this.a6 = var1.getNameTable();
      this.n5 = new x7[64];
      this.k5 = 63;
   }

   public final x7 n5(String var1, String var2, String var3, com.aspose.slides.internal.b8c.u4 var4) {
      if (var1 == null) {
         var1 = com.aspose.slides.ms.System.d1.n5;
      }

      if (var3 == null) {
         var3 = com.aspose.slides.ms.System.d1.n5;
      }

      int var5 = x7.n5(var2);

      for (x7 var6 = this.n5[var5 & this.k5]; var6 != null; var6 = var6.l6) {
         if (var6.hashCode() == var5
            && (var6.c8() == var2 || com.aspose.slides.ms.System.d1.a6(var6.c8(), var2))
            && (var6.s7() == var1 || com.aspose.slides.ms.System.d1.a6(var6.s7(), var1))
            && (var6.t2() == var3 || com.aspose.slides.ms.System.d1.a6(var6.t2(), var3))
            && var6.n5(var4)) {
            return var6;
         }
      }

      return null;
   }

   public final x7 l6(String var1, String var2, String var3, com.aspose.slides.internal.b8c.u4 var4) {
      if (var1 == null) {
         var1 = com.aspose.slides.ms.System.d1.n5;
      }

      if (var3 == null) {
         var3 = com.aspose.slides.ms.System.d1.n5;
      }

      int var5 = x7.n5(var2);

      for (x7 var6 = this.n5[var5 & this.k5]; var6 != null; var6 = var6.l6) {
         if (var6.hashCode() == var5
            && (var6.c8() == var2 || com.aspose.slides.ms.System.d1.a6(var6.c8(), var2))
            && (var6.s7() == var1 || com.aspose.slides.ms.System.d1.a6(var6.s7(), var1))
            && (var6.t2() == var3 || com.aspose.slides.ms.System.d1.a6(var6.t2(), var3))
            && var6.n5(var4)) {
            return var6;
         }
      }

      var1 = this.a6.n5(var1);
      var2 = this.a6.n5(var2);
      var3 = this.a6.n5(var3);
      int var11 = var5 & this.k5;
      x7 var7 = x7.n5(var1, var2, var3, var5, this.u3, this.n5[var11], var4);
      this.n5[var11] = var7;
      if (this.l6++ == this.k5) {
         this.n5();
      }

      return var7;
   }

   private void n5() {
      int var1 = this.k5 * 2 + 1;
      x7[] var2 = this.n5;
      x7[] var3 = new x7[var1 + 1];

      for (int var4 = 0; var4 < var2.length; var4++) {
         x7 var5 = var2[var4];

         while (var5 != null) {
            int var6 = var5.hashCode() & var1;
            x7 var7 = var5.l6;
            var5.l6 = var3[var6];
            var3[var6] = var5;
            var5 = var7;
         }
      }

      this.n5 = var3;
      this.k5 = var1;
   }
}
