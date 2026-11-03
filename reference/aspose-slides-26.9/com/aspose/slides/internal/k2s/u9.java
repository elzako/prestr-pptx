package com.aspose.slides.internal.k2s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.b3z.c8;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.d0e.t2;
import com.aspose.slides.internal.e1x.a0;
import com.aspose.slides.internal.e1x.b3;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.m3.d5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public abstract class u9 {
   protected float n5 = 0.0F;
   protected float l6 = 0.0F;
   protected float k5 = 0.0F;
   protected final x8 u3;
   protected final n3 a6;
   protected final com.aspose.slides.internal.b5j.u9 u9;
   protected final com.aspose.slides.internal.b5j.u3 h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("serif", "sans-serif", "monospace");

   protected u9(x8 var1, n3 var2, com.aspose.slides.internal.b5j.u9 var3, com.aspose.slides.internal.b5j.u3 var4) {
      this.a6 = var2;
      this.u3 = var1;
      this.h0 = var4;
      this.u9 = var3;
   }

   protected abstract k5 n5(a6 var1, l6 var2);

   protected abstract h0 n5(a6 var1, com.aspose.slides.internal.p1s.l6 var2);

   protected abstract void n5(com.aspose.slides.internal.i1k.u9 var1, f2 var2);

   public void n5(com.aspose.slides.internal.j7h.n5 var1, f2 var2) {
      try {
         String var3 = this.n5(var1);
         if (d1.n5(var3)) {
            return;
         }

         List var4 = new List();
         t2 var5 = var1.z8();
         var4.insertItem(0, var5);

         while (var5.z8() != null) {
            var5 = var5.z8();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.d8v.l6.class)
               || com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.j7h.k5.class)
               || com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.d8v.a6.class)) {
               var4.insertItem(0, var5);
            }
         }

         a6 var6 = new a6(this.a6, this.u9, this.h0, this.u3);
         List$Enumerator var7 = var4.iterator();

         try {
            while (var7.hasNext()) {
               t2 var8 = (t2)var7.next();

               try {
                  var6.n5(var8);
               } catch (RuntimeException var17) {
                  if (!com.aspose.slides.internal.n1n.n5.n5) {
                     throw var17;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         var6.c8 = var3;
         float var20 = this.n5;
         com.aspose.slides.internal.j7h.u3 var9 = (com.aspose.slides.internal.j7h.u3)var1.n5;
         n5 var10 = this.n5(var9, var6);
         this.n5(var1, var6.c8, var2.a6(), var6, var10, false);
         if (var6.e2 || var6.t9 || var6.z1) {
            float var11 = n3.k5();
            com.aspose.slides.internal.i1k.u9 var12 = (com.aspose.slides.internal.i1k.u9)com.aspose.slides.internal.d0e.u9.n5("rect");
            float var13 = var6.a6 / 14.0F;
            if (var6.t4.l6.n5("stroke")) {
               var12.l6.n5("stroke", var6.t4.l6.k5("stroke"));
            }

            if (var6.t4.l6.n5("stroke-width")) {
               var12.l6.n5("stroke-width", var6.t4.l6.k5("stroke-width"));
            }

            if (var6.t4.l6.n5("fill")) {
               var12.l6.n5("fill", var6.t4.l6.k5("fill"));
            }

            var12.l6.n5("x", com.aspose.slides.internal.b3z.c8.n5(var20 * var11));
            var12.l6.n5("width", com.aspose.slides.internal.b3z.c8.n5((this.n5 - var20) * var11));
            var12.l6.n5("height", com.aspose.slides.internal.b3z.c8.n5(var13 * var11));
            if (var6.e2) {
               var12.l6.n5("y", com.aspose.slides.internal.b3z.c8.n5((this.l6 + var13 * 1.2F) * var11));
               var12.l6.l6("height", com.aspose.slides.internal.b3z.c8.n5(var13 * 1.2F * var11));
            } else if (var6.t9) {
               var12.l6.n5("y", com.aspose.slides.internal.b3z.c8.n5((this.l6 - var6.a6 * 0.8F) * var11));
            } else if (var6.z1) {
               var12.l6.n5("y", com.aspose.slides.internal.b3z.c8.n5((this.l6 - var6.a6 / 3.0F + var13) * var11));
            }

            if (var1.l6.n5("transform")) {
               var12.l6.n5("transform", var1.l6.k5("transform").toString());
            }

            this.n5(var12, var2.a6());
         }
      } catch (RuntimeException var19) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var19;
         }
      }
   }

   private n5 n5(com.aspose.slides.internal.j7h.u3 var1, a6 var2) {
      String var3 = var2.l6;
      if (var3 == null) {
         var3 = "";
      }

      String var4 = var3;
      List var5 = new List<>(com.aspose.slides.ms.System.u3.n5(d1.n5(var4, new String[]{",", "\r", "\n", "\t"}, 1)));
      int var6 = var2.l6();
      float var7 = var2.a6;
      List$Enumerator var8 = var5.iterator();

      try {
         while (var8.hasNext()) {
            String var9 = (String)var8.next();
            String var10 = d1.k5(d1.l6(var9),new char[]{ '"', '\''});
            if (var2.k5().containsKey(var10)) {
               a0 var17 = new a0(var2.k5().get_Item(var10));
               b3 var20 = new b3();
               return this.n5(var2, new com.aspose.slides.internal.p1s.l6(var7, var6, var20.n5(var17, var10)));
            }

            switch (c8.n5(var10)) {
               case 0:
                  var10 = y4.u3().a6();
                  break;
               case 1:
                  var10 = y4.k5().a6();
                  break;
               case 2:
                  var10 = y4.l6().a6();
            }

            i1 var11 = com.aspose.slides.internal.e1x.x8.u3().n5(var10, var6);
            if (var11 != null) {
               var2.l6 = var10;
               return this.n5(var2, new com.aspose.slides.internal.p1s.l6(var7, var6, var11));
            }

            if (this.u3.n5().containsKey(var10)) {
               List var12 = com.aspose.slides.internal.k2s.l6.n5(this.u3.n5().get_Item(var10), var2.u9);
               var12 = com.aspose.slides.internal.k2s.l6.l6(var12, var2.s7);
               var12 = com.aspose.slides.internal.k2s.l6.n5(var12, var2.h0);
               if (var12.size() > 0) {
                  return this.n5(var2, (l6)var12.get_Item(0));
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      return this.n5(var2, com.aspose.slides.internal.e1x.x8.u3().n5("Times-Roman", var7, var6));
   }

   protected void n5(t2 var1, String var2, f2 var3, a6 var4, n5 var5, boolean var6) {
      com.aspose.slides.internal.j7h.u3 var7 = (com.aspose.slides.internal.j7h.u3)var1.z8();
      com.aspose.slides.internal.b3z.u9 var8 = var7.a0();
      if (var8 == null) {
         var8 = new com.aspose.slides.internal.b3z.u9();
      }

      com.aspose.slides.internal.b3z.u9 var9 = var8;
      com.aspose.slides.internal.b3z.u9 var10 = var7.d2();
      if (var10 == null) {
         var10 = new com.aspose.slides.internal.b3z.u9();
      }

      com.aspose.slides.internal.b3z.u9 var11 = var10;
      com.aspose.slides.internal.b3z.u9 var12 = var7.d5();
      if (var12 == null) {
         var12 = new com.aspose.slides.internal.b3z.u9();
      }

      com.aspose.slides.internal.b3z.u9 var13 = var12;
      com.aspose.slides.internal.b3z.u9 var14 = var7.s3();
      if (var14 == null) {
         var14 = new com.aspose.slides.internal.b3z.u9();
      }

      com.aspose.slides.internal.b3z.u9 var15 = var14;
      if (var6) {
         var13 = new com.aspose.slides.internal.b3z.u9();
         var15 = new com.aspose.slides.internal.b3z.u9();
      }

      com.aspose.slides.internal.b3z.t2 var16 = var7.p8();
      if (var16 == null) {
         var16 = new com.aspose.slides.internal.b3z.t2();
      }

      com.aspose.slides.internal.b3z.t2 var17 = var16;
      float var18 = 0.0F;
      if (!n1.l6(var4.t2, 0.0F) && var2.length() > 1) {
         float var19 = var5.n5(var2);
         var18 = (var19 - var4.t2) / (var2.length() - 1);
      }

      float var24 = 0.0F;
      if (!n1.l6(var4.x8, 0.0F) && var2.length() > 1) {
         var24 = var4.x8;
      }

      this.n5(0, var1, var11, var15, var3.a6());
      float var20 = var6 ? 0.0F : this.n5(var7, var5);
      this.l6 += var20;

      for (int var21 = 0; var21 < var2.length(); var21++) {
         char var22 = var2.charAt(var21);
         if (var21 > 0) {
            if (var21 < var9.size()) {
               this.n5 = this.a6.n5(var9.get_Item(var21).toString(), "x", var1, var3.a6());
            } else {
               this.n5 = this.n5 - var5.n5(var2.charAt(var21 - 1), var22);
            }

            if (var21 < var13.size()) {
               this.l6 = this.a6.n5(var13.get_Item(var21).toString(), "y", var1, var3.a6());
               this.l6 += var20;
            }

            this.n5(var21, var1, var11, var15, var3.a6());
         }

         float var23;
         if (var6) {
            var23 = var5.n5(var22);
         } else {
            var23 = var5.n5(var1, var22, this.n5, this.l6, this.k5, var3.a6());
         }

         if (var21 + 1 < var17.size()) {
            this.k5 = var17.get_Item(var21 + 1);
         }

         this.n5 += var23 - var18 + var24;
      }
   }

   public final void n5(com.aspose.slides.internal.j7h.u3 var1, f2 var2) {
      com.aspose.slides.internal.d0e.k5 var3 = var1.l6;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.j7h.k5.class)) {
         this.n5 = this.l6 = this.k5 = 0.0F;
      }

      if (var3.n5("x")) {
         this.n5 = this.a6.n5(var1.a0().get_Item(0).toString(), "x", var1, var2.a6());
      }

      if (var3.n5("y")) {
         this.l6 = this.a6.n5(var1.d5().get_Item(0).toString(), "y", var1, var2.a6());
      }

      if (var3.n5("rotate")) {
         this.k5 = var1.p8().get_Item(0);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.j7h.k5.class)
         || com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.j7h.l6.class) && var3.n5("x")) {
         int var4 = 0;
         if (var1.l6.n5("text-anchor")) {
            var4 = com.aspose.slides.internal.k2s.u3.n5(var1.l6.k5("text-anchor"));
            var1.x8(var4);
         }

         String var5 = d1.n5;
         com.aspose.slides.internal.j7h.u3 var6 = var1;
         float var7 = this.n5;
         int var8 = 0;
         if (com.aspose.slides.internal.v6g.k5.l6(var6, com.aspose.slides.internal.j7h.l6.class)
            && com.aspose.slides.internal.v6g.k5.l6(var6.z8(), com.aspose.slides.internal.j7h.k5.class)) {
            var1 = (com.aspose.slides.internal.j7h.u3)var6.z8();

            for (int var9 = 0; var9 < var1.j5().n5(); var9++) {
               if (var1.j5().l6(var9) == var6) {
                  var8 = var9;
                  break;
               }
            }
         }

         String[] var14 = new String[]{var5};
         com.aspose.slides.internal.j7h.u3[] var10 = new com.aspose.slides.internal.j7h.u3[]{var6};
         this.n5(var1, var7, var4, var2.a6(), var8, var14, var10);
         var5 = var14[0];
         var6 = var10[0];
         if (var4 == 1) {
            float var11 = this.n5 - var7;
            this.n5 = var7 - var11 / 2.0F;
         } else if (var4 == 2) {
            float var15 = this.n5 - var7;
            this.n5 = var7 - var15;
         } else {
            this.n5 = var7;
         }

         var6.x8(var5);
      }
   }

   public final void n5(
      com.aspose.slides.internal.j7h.u3 var1, float var2, int var3, f2 var4, int var5, String[] var6, com.aspose.slides.internal.j7h.u3[] var7
   ) {
      for (int var8 = var5; var8 < var1.j5().n5(); var8++) {
         t2 var9 = var1.j5().l6(var8);
         if (com.aspose.slides.internal.v6g.k5.l6(var9, com.aspose.slides.internal.j7h.n5.class)) {
            String var22 = this.n5((com.aspose.slides.internal.j7h.n5)var9);
            if (!d1.n5(var22)) {
               var6[0] = d1.n5(var6[0], var22);
               if (var3 == 1 || var3 == 2) {
                  List var23 = new List();
                  t2 var12 = var9.z8();
                  var23.insertItem(0, var12);

                  while (var12.z8() != null) {
                     var12 = var12.z8();
                     if (com.aspose.slides.internal.v6g.k5.l6(var12, com.aspose.slides.internal.d8v.l6.class)
                        || com.aspose.slides.internal.v6g.k5.l6(var12, com.aspose.slides.internal.j7h.k5.class)
                        || com.aspose.slides.internal.v6g.k5.l6(var12, com.aspose.slides.internal.d8v.a6.class)) {
                        var23.insertItem(0, var12);
                     }
                  }

                  a6 var13 = new a6(this.a6, this.u9, this.h0, this.u3);
                  List$Enumerator var14 = var23.iterator();

                  try {
                     while (var14.hasNext()) {
                        t2 var15 = (t2)var14.next();

                        try {
                           var13.n5(var15);
                        } catch (RuntimeException var20) {
                           if (!com.aspose.slides.internal.n1n.n5.n5) {
                              throw var20;
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
                        var14.dispose();
                     }
                  }

                  var13.c8 = var22;
                  com.aspose.slides.internal.j7h.u3 var24 = (com.aspose.slides.internal.j7h.u3)var9.n5;
                  n5 var16 = this.n5(var24, var13);
                  this.n5(var9, var13.c8, var4.a6(), var13, var16, true);
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var9, com.aspose.slides.internal.j7h.l6.class)) {
            com.aspose.slides.internal.j7h.l6 var10 = com.aspose.slides.internal.v6g.k5.n5(var9, com.aspose.slides.internal.j7h.l6.class);
            if (var9.l6.n5("x") && var5 < var8) {
               return;
            }

            if (var9.l6.n5("text-anchor")) {
               var10.x8(com.aspose.slides.internal.k2s.u3.n5(var9.l6.k5("text-anchor")));
            } else {
               for (t2 var11 = var9.z8(); var11 != null; var11 = var11.z8()) {
                  if (var11.l6.n5("text-anchor")) {
                     var10.x8(com.aspose.slides.internal.k2s.u3.n5(var11.l6.k5("text-anchor")));
                     break;
                  }
               }
            }

            this.n5((com.aspose.slides.internal.j7h.u3)var1.j5().l6(var8), var2, var3, var4.a6(), 0, var6, var7);
         }
      }
   }

   protected final float n5(com.aspose.slides.internal.j7h.u3 var1, n5 var2) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = !var1.l6.n5("dominant-baseline", var4);
      var3 = var4[0];
      if (var5) {
         return 0.0F;
      }

      int var6 = com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(d5.class), var3);
      if (var6 > 4) {
         h0 var7 = com.aspose.slides.internal.v6g.k5.n5(var2, h0.class);
         if (var7 == null) {
            return 0.0F;
         }

         com.aspose.slides.internal.p1s.l6 var8 = var7.n5();
         if (var8 == null) {
            return 0.0F;
         }

         i1 var9 = var8.n5();
         switch (var6) {
            case 5:
               return var9.n5((float)var9.z8(), (float)var8.c8());
            case 6:
            case 10:
               return -var8.s7();
            case 7:
               return var9.n5((float)var9.j5(), (float)var8.c8());
            case 8:
               return var9.n5((float)var9.z8(), (float)var8.c8()) / 2.0F;
            case 9:
               return var9.n5((float)var9.j5(), (float)var8.c8()) / 2.0F;
            case 11:
               return var8.t2();
         }
      }

      return 0.0F;
   }

   protected final String n5(com.aspose.slides.internal.j7h.n5 var1) {
      String var2 = var1.c8;
      a5 var3 = new a5();
      String var4 = d1.n5(d1.n5(d1.n5(d1.a6(var2,new char[]{ '\r', '\n'}), '\t', ' '), "\r", " "), "\n", " ");
      boolean var5 = "preserve".equals(var1.z8().l6.k5("xml:space"));
      if (var5) {
         return n5(var4, var3);
      }

      com.aspose.slides.internal.d0e.u3 var6 = var1.n5.j5();
      boolean var7 = var6.l6(0) == var1;
      boolean var8 = var6.l6(var6.n5() - 1) == var1;
      if (var7) {
         var4 = d1.u3(var4,new char[]{ ' '});
      }

      if (var8) {
         var4 = d1.a6(var4,new char[]{ ' '});
      }

      return n5(var4, var3);
   }

   private static String n5(String var0, a5 var1) {
      char var2 = 0;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 <= 8202 || var4 >= 8208) && (var4 <= 8233 || var4 >= 8239)) {
            if (var2 != ' ' || var4 != ' ') {
               var1.n5(var4);
            }

            var2 = var4;
         }
      }

      return var1.toString();
   }

   protected final void n5(int var1, t2 var2, com.aspose.slides.internal.b3z.u9 var3, com.aspose.slides.internal.b3z.u9 var4, f2 var5) {
      if (var1 < var3.size()) {
         this.n5 = this.n5 + this.a6.n5(var3.get_Item(var1).toString(), "dx", var2, var5.a6());
      }

      if (var1 < var4.size()) {
         this.l6 = this.l6 + this.a6.n5(var4.get_Item(var1).toString(), "dy", var2, var5.a6());
      }
   }

   protected final void n5(t2 var1, n5 var2) {
      for (t2 var3 = var1.z8(); var3 != null; var3 = var3.z8()) {
         com.aspose.slides.internal.j7h.u3 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.j7h.u3.class);
         if (var4 != null && var4.b3() != null) {
            float var5 = var2.n5(var4.b3());
            switch (var4.e5()) {
               case 1:
                  this.n5 -= var5 / 2.0F;
                  break;
               case 2:
                  this.n5 -= var5;
            }

            var4.x8(null);
            break;
         }
      }
   }
}
