package com.aspose.slides.internal.e6s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.s3;
import com.aspose.slides.ms.System.z3;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.a4;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.p5;
import com.aspose.slides.ms.System.Xml.u8;
import com.aspose.slides.ms.System.Xml.w4;

public class a6 {
   public float n5;
   private final u9 l6;
   private final u9 k5;
   private final n5 u3;
   private l6 a6;

   public a6(u9 var1, u9 var2, n5 var3) {
      this.u3 = var3;
      this.l6 = var1;
      this.k5 = var2;
      this.n5 = 0.0F;
   }

   private c7 n5(u9 var1) {
      c7 var2 = c7.n5(var1.n5(), new w4());
      p5 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, p5.class);
      if (var3 != null) {
         var3.u9(this.u3.k5());
      }

      if (this.u3.l6() && var2.n5() != null) {
         var2.n5().u9(4);
      }

      return var2;
   }

   public final l6 n5() {
      if (this.a6 == null) {
         this.a6 = new l6();
         c7 var1 = null;
         c7 var2 = null;

         try {
            var1 = this.n5(this.l6);
            var2 = this.n5(this.k5);
            if (!this.l6.equals(this.k5)) {
               this.n5(this.a6, var1, var2);
            }
         } finally {
            try {
               if (var2 != null) {
                  var2.w1();
               }
            } finally {
               if (var1 != null) {
                  var1.w1();
               }
            }
         }
      }

      return this.a6;
   }

   private void n5(l6 var1, c7 var2, c7 var3) {
      try {
         a6$l6 var4 = new a6$l6(var2);
         a6$l6 var5 = new a6$l6(var3);

         do {
            var4.n5();
            var5.n5();
            this.n5(var1, var4, var5);
         } while (var4.l6 && var5.l6);
      } catch (a6$n5 var6) {
      }
   }

   private void n5(l6 var1, a6$l6 var2, a6$l6 var3) {
      if (var2.l6) {
         if (var3.l6) {
            this.l6(var1, var2, var3);
            this.a6(var1, var2, var3);
         } else {
            this.n5(19, var1);
         }
      }
   }

   private void l6(l6 var1, a6$l6 var2, a6$l6 var3) {
      int var4 = var2.n5.s7();
      int var5 = var3.n5.s7();
      if (!s3.n5(a4.class, var4, a4.class, var5)) {
         this.n5(var4, var5, var1, var2, var3);
      } else if (var4 == 1) {
         this.k5(var1, var2, var3);
      } else if (var4 == 3) {
         this.u3(var1, var2, var3);
      }
   }

   private void n5(int var1, int var2, l6 var3, a6$l6 var4, a6$l6 var5) {
      a6$l6 var6 = null;
      if (s3.n5(a4.class, var1, a4.class, 17L)) {
         var6 = var4;
      } else if (s3.n5(a4.class, var2, a4.class, 17L)) {
         var6 = var5;
      }

      if (var6 != null) {
         this.n5(22, var1, var2, var3);
         var6.n5();
         this.l6(var3, var4, var5);
      } else {
         this.n5(17, var1, var2, var3);
      }
   }

   private void k5(l6 var1, a6$l6 var2, a6$l6 var3) {
      String var4 = var2.n5.x8();
      String var5 = var3.n5.x8();
      if (!d1.a6(var4, var5)) {
         this.n5(10, var1);
      } else {
         u8[] var6 = n5(var2);
         u8[] var7 = n5(var3);
         if (var6.length != var7.length) {
            this.n5(11, var1);
         }

         this.n5(var1, var6, var7);
      }
   }

   private void n5(l6 var1, u8[] var2, u8[] var3) {
      List var4 = new List();
      var4.addRange(com.aspose.slides.ms.System.u3.n5(var3));

      for (int var5 = 0; var5 < var2.length; var5++) {
         boolean var6 = l6(var2[var5]);
         String var7 = n5((l0)var2[var5]);
         u8 var8 = null;
         if (!var6) {
            var8 = n5(var3, var7);
         } else {
            var8 = n5(var3, var7, var2[var5].getNamespaceURI());
         }

         if (var8 != null) {
            var4.removeItem(var8);
            if (!this.u3.u3() && var8 != var3[var5]) {
               this.n5(4, var1);
            }

            if (!d1.a6(var2[var5].getValue(), var8.getValue())) {
               String var9 = var2[var5].getValue();
               String var10 = var8.getValue();
               float var11 = 0.0F;
               float var12 = 0.0F;
               if ("OriginX".equals(var2[var5].getLocalName()) || "OriginY".equals(var2[var5].getLocalName())) {
                  var11 = z3.u9(var9);
                  var12 = z3.u9(var10);
                  this.n5 = q1.n5(this.n5, q1.n5(var11 - var12));
               } else if ("RenderTransform".equals(var2[var5].getLocalName())) {
                  var11 = z3.u9(d1.n5(var9, ',')[4]);
                  var12 = z3.u9(d1.n5(var10, ',')[4]);
                  this.n5 = q1.n5(this.n5, q1.n5(var11 - var12));
               } else if ("Data".equals(var2[var5].getLocalName())) {
                  String[] var13 = d1.n5(var9, ' ');
                  String[] var14 = d1.n5(var10, ' ');
                  byte var15 = 0;

                  while (var5 < var13.length - 1) {
                     var11 = z3.u9(d1.u3(d1.n5(var13[var15], ',')[0], 'M', 'L'));
                     var12 = z3.u9(d1.u3(d1.n5(var14[var15], ',')[0], 'M', 'L'));
                     this.n5 = q1.n5(this.n5, q1.n5(var11 - var12));
                     var11 = z3.u9(d1.n5(var13[var15], ',')[1]);
                     var12 = z3.u9(d1.n5(var14[var15], ',')[1]);
                     this.n5 = q1.n5(this.n5, q1.n5(var11 - var12));
                     var5++;
                  }
               } else {
                  this.n5(3, var1);
               }
            }
         } else {
            this.n5(2, var1);
         }
      }

      for (int var16 = 0; var16 < var4.size(); var16++) {
         this.n5(2, var1);
      }
   }

   private void u3(l6 var1, a6$l6 var2, a6$l6 var3) {
      String var4 = var2.n5.z1();
      String var5 = var3.n5.z1();
      if (!d1.a6(var4, var5)) {
         this.n5(14, var1);
      }
   }

   private void n5(int var1, l6 var2) {
      this.n5(new k5(var1), var2);
   }

   private void n5(k5 var1, l6 var2) {
      var2.n5(this, var1);
      if (!n5(var1)) {
         throw new a6$n5(var1);
      }
   }

   private void n5(int var1, int var2, int var3, l6 var4) {
      this.n5(new k5(var1, var2, var3), var4);
   }

   private static boolean n5(k5 var0) {
      return !var0.n5();
   }

   private void a6(l6 var1, a6$l6 var2, a6$l6 var3) {
      if (var2.k5) {
         if (!var3.k5) {
            this.n5(var3, var1);
         }
      } else if (var3.k5) {
         this.n5(var2, var1);
      }
   }

   private static u8[] n5(a6$l6 var0) {
      List var1 = new List();
      int var2 = var0.n5.z8();
      if (var2 > 0) {
         XmlDocument var3 = new XmlDocument();
         var0.n5.k5();

         for (int var4 = 0; var4 < var2; var4++) {
            u8 var5 = var3.createAttribute(var0.n5.x8(), var0.n5.y4());
            if (!n5(var5)) {
               var5.setValue(var0.n5.z1());
               var1.addItem(var5);
            }

            var0.n5.u3();
         }
      }

      return (u8[])var1.toArray(new u8[0]);
   }

   private static boolean n5(u8 var0) {
      return "xmlns".equals(var0.getPrefix()) || "xmlns".equals(var0.getName());
   }

   private static u8 n5(u8[] var0, String var1) {
      for (u8 var5 : var0) {
         if (d1.a6(n5((l0)var5), var1)) {
            return var5;
         }
      }

      return null;
   }

   private static u8 n5(u8[] var0, String var1, String var2) {
      for (u8 var6 : var0) {
         if (d1.a6(n5((l0)var6), var1) && d1.a6(var6.getNamespaceURI(), var2)) {
            return var6;
         }
      }

      return null;
   }

   private static String n5(l0 var0) {
      return n5(var0, l6(var0));
   }

   private static String n5(l0 var0, boolean var1) {
      return var1 ? var0.getLocalName() : var0.getName();
   }

   private static boolean l6(l0 var0) {
      String var1 = var0.getNamespaceURI();
      return var1 != null && var1.length() > 0;
   }

   private void n5(a6$l6 var1, l6 var2) {
      boolean var3 = var1.n5();
      if (!var3 || var1.n5.s7() != 15) {
         this.n5(19, var2);
      }
   }

   public final String l6() {
      return this.u3.n5();
   }
}
