package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.XmlSchemaException;

public class y4 {
   public com.aspose.slides.ms.System.Xml.k6 n5;
   private int u3;
   private k5 a6;
   private k5[] u9;
   public com.aspose.slides.ms.System.Xml.k6 l6;
   public static final y4 k5 = new y4();

   public final int n5() {
      return this.u3;
   }

   public final k5 l6() {
      return this.a6;
   }

   public final k5[] k5() {
      return this.u9;
   }

   private y4() {
      this.n5 = com.aspose.slides.ms.System.Xml.k6.n5;
      this.l6 = com.aspose.slides.ms.System.Xml.k6.n5;
   }

   public y4(m2 var1, com.aspose.slides.ms.System.Xml.s2 var2) {
      this.n5 = com.aspose.slides.ms.System.Xml.k6.n5;
      this.l6 = com.aspose.slides.ms.System.Xml.k6.n5;
      this.n5 = var1.h0();

      try {
         this.a6 = new k5(var1.l6().n5(), false, var2);
      } catch (XmlSchemaException var7) {
         var7.setSource(var1.l6());
         throw var7;
      }

      z4 var3 = var1.u9();
      this.u9 = new k5[var3.size()];

      for (int var4 = 0; var4 < var3.size(); var4++) {
         try {
            this.u9[var4] = new k5(((k1d)var3.n5(var4)).n5(), true, var2);
         } catch (XmlSchemaException var6) {
            var6.setSource(var1.u9().n5(var4));
            throw var6;
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, n3c.class)) {
         this.u3 = 0;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, w6.class)) {
         this.u3 = 1;
      } else {
         this.u3 = 2;
         this.l6 = ((g5)var1).t2();
      }
   }
}
