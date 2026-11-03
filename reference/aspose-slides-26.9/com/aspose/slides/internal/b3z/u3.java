package com.aspose.slides.internal.b3z;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e2;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.z3;

public class u3 {
   private String n5;
   private int l6;
   private com.aspose.slides.internal.o9b.c8 k5 = new com.aspose.slides.internal.o9b.c8();
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "activeborder",
      "activecaption",
      "appworkspace",
      "background",
      "buttonface",
      "buttonhighlight",
      "buttonshadow",
      "buttontext",
      "captiontext",
      "graytext",
      "highlight",
      "highlighttext",
      "inactiveborder",
      "inactivecaption",
      "inactivecaptiontext",
      "infobackground",
      "infotext",
      "menu",
      "menutext",
      "scrollbar",
      "threeddarkshadow",
      "threedface",
      "threedhighlight",
      "threedlightshadow",
      "threedshadow",
      "window",
      "windowframe",
      "windowtext"
   );

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.o9b.c8 n5() {
      return this.k5.o8();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.k5 = var1.o8();
   }

   public u3(com.aspose.slides.internal.o9b.c8 var1) {
      this.n5(var1.o8());
      this.n5(1);
   }

   public static u3 n5(String var0) {
      return n5(var0, 1.0F);
   }

   public static u3 n5(String var0, float var1) {
      u3 var2 = new u3(com.aspose.slides.internal.o9b.c8.e2().o8());
      var2.n5 = var0;

      try {
         if (var0 != null) {
            var0 = d1.l6(var0);
         }

         if ("none".equals(d1.u9(var0))) {
            return var2;
         }

         int var3 = com.aspose.slides.internal.v6g.k5.u3(255.0F * var1, 13);
         if (d1.l6(d1.u9(var0), "rgb(")) {
            var0 = d1.n5(var0, "rgb(", d1.n5);
            if (d1.k5(d1.u9(var0), ")")) {
               var0 = d1.n5(var0, ")", d1.n5);
            }

            String[] var14 = d1.n5(var0, new String[]{","}, 1);
            int var5 = !d1.k5(var14[0], "%") ? z3.u3(var14[0]) : com.aspose.slides.internal.v6g.k5.u3(q1.u3(255.0 * z3.h0(d1.a6(var14[0],new char[]{ '%'})) / 100.0), 14);
            int var6 = !d1.k5(var14[1], "%") ? z3.u3(var14[1]) : com.aspose.slides.internal.v6g.k5.u3(q1.u3(255.0 * z3.h0(d1.a6(var14[1],new char[]{ '%'})) / 100.0), 14);
            int var7 = !d1.k5(var14[2], "%") ? z3.u3(var14[2]) : com.aspose.slides.internal.v6g.k5.u3(q1.u3(255.0 * z3.h0(d1.a6(var14[2],new char[]{ '%'})) / 100.0), 14);
            var2.n5(com.aspose.slides.internal.o9b.c8.n5(var3, var5, var6, var7).o8());
         } else if (d1.l6(d1.u9(var0), "#") && var0.length() == 7) {
            var0 = d1.n5(var0, "#", d1.n5);
            String[] var13 = new String[]{d1.l6(var0, 0, 2), d1.l6(var0, 2, 2), d1.l6(var0, 4, 2)};
            var2.n5(com.aspose.slides.internal.o9b.c8.n5(var3, a3.n5(var13[0], 512), a3.n5(var13[1], 512), a3.n5(var13[2], 512)).o8());
         } else if (d1.l6(d1.u9(var0), "#") && var0.length() == 4) {
            var0 = d1.n5(var0, "#", d1.n5);
            String[] var12 = new String[]{
               d1.n5(new String[]{d1.l6(var0, 0, 1), d1.l6(var0, 0, 1)}), d1.n5(new String[]{d1.l6(var0, 1, 1), d1.l6(var0, 1, 1)}), d1.n5(new String[]{d1.l6(var0, 2, 1), d1.l6(var0, 2, 1)})
            };
            var2.n5(com.aspose.slides.internal.o9b.c8.n5(var3, a3.n5(var12[0], 512), a3.n5(var12[1], 512), a3.n5(var12[2], 512)).o8());
         } else {
            com.aspose.slides.internal.o9b.c8 var4 = l6(var0).o8();
            var2.n5(com.aspose.slides.internal.o9b.c8.n5(var3, var4.x8() & 255, var4.n3() & 255, var4.y4() & 255).o8());
         }
      } catch (RuntimeException var8) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var8;
         }
      }

      return var2;
   }

   @Override
   public String toString() {
      return this.n5 != null
         ? this.n5
         : d1.n5(
            "#{0}{1}{2}",new Object[]{
            e2.n5(this.n5().x8(), "X2", com.aspose.slides.internal.x7n.l6.k5()),
            e2.n5(this.n5().n3(), "X2", com.aspose.slides.internal.x7n.l6.k5()),
            e2.n5(this.n5().y4(), "X2", com.aspose.slides.internal.x7n.l6.k5())
         });
   }

   private static com.aspose.slides.internal.o9b.c8 l6(String var0) {
      switch (u3.n5(d1.a6(var0))) {
         case 0:
            return com.aspose.slides.internal.n2d.l6.n5();
         case 1:
            return com.aspose.slides.internal.n2d.l6.l6();
         case 2:
            return com.aspose.slides.internal.n2d.l6.u3();
         case 3:
            return com.aspose.slides.internal.n2d.l6.e2();
         case 4:
            return com.aspose.slides.internal.n2d.l6.a6();
         case 5:
            return com.aspose.slides.internal.n2d.l6.u9();
         case 6:
            return com.aspose.slides.internal.n2d.l6.h0();
         case 7:
            return com.aspose.slides.internal.n2d.l6.y4();
         case 8:
            return com.aspose.slides.internal.n2d.l6.k5();
         case 9:
            return com.aspose.slides.internal.n2d.l6.t9();
         case 10:
            return com.aspose.slides.internal.n2d.l6.z1();
         case 11:
            return com.aspose.slides.internal.n2d.l6.t4();
         case 12:
            return com.aspose.slides.internal.n2d.l6.z3();
         case 13:
            return com.aspose.slides.internal.n2d.l6.m1();
         case 14:
            return com.aspose.slides.internal.n2d.l6.k7();
         case 15:
            return com.aspose.slides.internal.n2d.l6.m3();
         case 16:
            return com.aspose.slides.internal.n2d.l6.z8();
         case 17:
            return com.aspose.slides.internal.n2d.l6.j5();
         case 18:
            return com.aspose.slides.internal.n2d.l6.w1();
         case 19:
            return com.aspose.slides.internal.n2d.l6.r4();
         case 20:
            return com.aspose.slides.internal.n2d.l6.s7();
         case 21:
            return com.aspose.slides.internal.n2d.l6.c8();
         case 22:
            return com.aspose.slides.internal.n2d.l6.x8();
         case 23:
            return com.aspose.slides.internal.n2d.l6.n3();
         case 24:
            return com.aspose.slides.internal.n2d.l6.t2();
         case 25:
            return com.aspose.slides.internal.n2d.l6.c4();
         case 26:
            return com.aspose.slides.internal.n2d.l6.y2();
         case 27:
            return com.aspose.slides.internal.n2d.l6.y1();
         default:
            return com.aspose.slides.internal.o9b.c8.n5(var0);
      }
   }
}
