package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class h6l {
   public static void n5(
      com.aspose.slides.internal.o9b.y1 var0,
      String var1,
      int var2,
      com.aspose.slides.internal.o9b.n3 var3,
      com.aspose.slides.internal.o9b.c8 var4,
      int var5,
      int var6,
      n1g var7
   ) {
      AutoShape var8 = n5(var1, var3, var4.o8(), var5, var6, var7);
      switch (com.aspose.slides.ms.System.q1.n5(var2)) {
         case 0:
            var8.setX(var0.x8());
            var8.setY(var0.n3());
            var8.setWidth(var0.s7());
            var8.setHeight(var0.k5());
            break;
         case 90:
            var8.setRotation(-var2);
            com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(var0.x8() + var0.s7() / 2.0F, var0.n3() + var0.k5() / 2.0F);
            var0 = new com.aspose.slides.internal.o9b.y1(var9.l6() - var0.k5() / 2.0F, var9.k5() - var0.s7() / 2.0F, var0.k5(), var0.s7());
            var8.setX(var0.x8());
            var8.setY(var0.n3());
            var8.setWidth(var0.s7());
            var8.setHeight(var0.k5());
            break;
         default:
            var8.setX(var0.x8());
            var8.setY(var0.n3());
            var8.setWidth(var0.s7());
            var8.setHeight(var0.k5());
            var8.setRotation(-var2);
      }

      com.aspose.slides.internal.w0.c8 var11 = var7.d2().q0();
      var8.e5().n5(var7.d2(), var7.d5(), InterruptionToken.getNone());
      var7.d2().l6(var11);
   }

   public static com.aspose.slides.internal.o9b.p8 n5(
      String var0, float var1, com.aspose.slides.internal.o9b.n3 var2, int var3, n1g var4, com.aspose.slides.internal.o9b.f2 var5
   ) {
      if (var2 == null) {
         throw new ArgumentNullException("font");
      }

      if (var4 == null) {
         throw new ArgumentNullException("renderContext");
      }

      AutoShape var6 = n5(var0, var2, com.aspose.slides.internal.o9b.c8.u3.o8(), var3, 2, var4);
      float var7 = com.aspose.slides.ms.System.n1.k5(var1) ? 0.0F : var1;
      var6.setWidth(com.aspose.slides.ms.System.q1.n5(var7) == 90.0F ? var5.k5() : var5.l6());
      var6.setHeight(com.aspose.slides.ms.System.q1.n5(var7) == 90.0F ? var5.l6() : var5.k5());
      var6.setRotation(-var7);
      s3z.l6(var6.l6().u3);
      com.aspose.slides.internal.o9b.y1[] var8 = s3z.n5(var6.l6().u3);
      z3y var9 = new z3y(x5h.n5(var8).y4());
      var9.n5(var7);
      int var10 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var9.l6()), 14);
      int var11 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var9.k5()), 14);
      return new com.aspose.slides.internal.o9b.p8(var10, var11);
   }

   public static AutoShape n5(String var0, com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.o9b.c8 var2, int var3, int var4, n1g var5) {
      AutoShape var6 = new AutoShape(var5.n3());
      var6.setShapeType(5);
      var6.addTextFrame(com.aspose.slides.ms.System.d1.a6(var0, com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.p8.k5())));
      FontData var7 = new FontData(var1.l6().a6());
      com.aspose.slides.internal.o9b.c8 var8 = var2.o8();
      IGenericEnumerator var9 = var6.getTextFrame().getParagraphs().iterator();

      try {
         while (var9.hasNext()) {
            IParagraph var10 = (IParagraph)var9.next();
            var10.getParagraphFormat().setAlignment(var3);
            if (var10.getParagraphFormat().getBullet().getType() == -1) {
               var10.getParagraphFormat().getBullet().setType((byte)0);
            }

            IPortionFormat var11 = var10.getParagraphFormat().getDefaultPortionFormat();
            var11.getFillFormat().setFillType((byte)1);
            ((ColorFormat)var11.getFillFormat().getSolidFillColor()).n5(var8.o8());
            if (var11.getLatinFont() == null) {
               var11.setLatinFont(var7);
            }

            if (var11.getEastAsianFont() == null) {
               var11.setEastAsianFont(var7);
            }

            if (com.aspose.slides.ms.System.d2.k5(var11.getFontHeight())) {
               var11.setFontHeight(var1.c8());
            }

            if (var11.getFontBold() == -1) {
               var11.setFontBold((byte)(var1.n5() ? 1 : 0));
            }

            if (var11.getFontItalic() == -1) {
               var11.setFontItalic((byte)(var1.u9() ? 1 : 0));
            }

            if (var11.getFontUnderline() == -1) {
               var11.setFontUnderline((byte)(var1.n3() ? 2 : 0));
            }

            IParagraphFormat var12 = var10.getParagraphFormat();
            if (var12.getAlignment() == -1) {
               var12.setAlignment(1);
            }

            if (var12.getFontAlignment() == -1) {
               var12.setFontAlignment(2);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      TextFrameFormat var16 = (TextFrameFormat)var6.l6().getTextFrameFormat();
      var16.n5(var16.u3().n5(c0u.n5.l6()).l6());
      return var6;
   }

   public static com.aspose.slides.internal.o9b.p8 n5(
      String var0, int var1, com.aspose.slides.internal.o9b.n3 var2, com.aspose.slides.internal.o9b.p8 var3, int var4, int var5
   ) {
      com.aspose.slides.internal.o9b.f2 var6 = new com.aspose.slides.internal.o9b.f2(var3.l6(), var3.k5());
      return n5(var0, var1, var2, var6.a6(), var4, var5);
   }

   public static com.aspose.slides.internal.o9b.p8 n5(
      String var0, int var1, com.aspose.slides.internal.o9b.n3 var2, com.aspose.slides.internal.o9b.f2 var3, int var4, int var5
   ) {
      return n5(var0, var1, var2, var3.a6(), var4, var5, false);
   }

   public static com.aspose.slides.internal.o9b.p8 n5(
      String var0, int var1, com.aspose.slides.internal.o9b.n3 var2, com.aspose.slides.internal.o9b.f2 var3, int var4, int var5, boolean var6
   ) {
      if (com.aspose.slides.ms.System.d1.k5(var0, "\n")) {
         var0 = com.aspose.slides.ms.System.d1.n5(var0, " ");
      }

      switch (com.aspose.slides.ms.System.q1.n5(var1)) {
         case 0:
            float var7 = n5(var0, var2, true);
            com.aspose.slides.internal.o9b.f2 var8 = new com.aspose.slides.internal.o9b.f2();
            if (!(var7 < var3.l6()) && !var6) {
               var8 = new com.aspose.slides.internal.o9b.f2(var7, var3.k5());
            } else {
               var3.l6(var8);
            }

            return k5(var0, 0, var2, var8.a6(), var4, var5);
         case 90:
            com.aspose.slides.internal.o9b.p8 var9 = n5(
                  var0,
                  var2,
                  new com.aspose.slides.internal.o9b.f2(
                     com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13), com.aspose.slides.internal.v6g.k5.u3(var3.l6(), 13)
                  ),
                  var4,
                  var5
               )
               .u3();
            return new com.aspose.slides.internal.o9b.p8(var9.k5(), var9.l6());
         default:
            com.aspose.slides.internal.o9b.l6 var10 = new com.aspose.slides.internal.o9b.l6(1, 1);
            com.aspose.slides.internal.o9b.z1 var11 = com.aspose.slides.internal.o9b.z1.n5(var10);
            com.aspose.slides.internal.o9b.f2 var12 = var11.n5(
                  var0, var2, new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F), new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2())
               )
               .a6();
            return n5(var12.a6(), var3.a6(), com.aspose.slides.ms.System.q1.n5(var1));
      }
   }

   public static com.aspose.slides.internal.o9b.f2 l6(
      String var0, int var1, com.aspose.slides.internal.o9b.n3 var2, com.aspose.slides.internal.o9b.f2 var3, int var4, int var5
   ) {
      if (com.aspose.slides.ms.System.d1.k5(var0, "\n")) {
         var0 = com.aspose.slides.ms.System.d1.n5(var0, " ");
      }

      com.aspose.slides.internal.o9b.f2 var6 = l6(var0, var2, var3.a6(), var4, var5).a6();
      switch (com.aspose.slides.ms.System.q1.n5(var1)) {
         case 0:
            return var6;
         case 90:
            return l6(
                  var0,
                  var2,
                  new com.aspose.slides.internal.o9b.f2(
                     com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13), com.aspose.slides.internal.v6g.k5.u3(var3.l6(), 13)
                  ),
                  var4,
                  var5
               )
               .a6();
         default:
            com.aspose.slides.internal.o9b.l6 var7 = new com.aspose.slides.internal.o9b.l6(1, 1);
            com.aspose.slides.internal.o9b.z1 var8 = com.aspose.slides.internal.o9b.z1.n5(var7);
            com.aspose.slides.internal.o9b.f2 var9 = var8.n5(
                  var0, var2, new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F), new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2())
               )
               .a6();
            return com.aspose.slides.internal.o9b.p8.n5(n5(var9.a6(), var3.a6(), com.aspose.slides.ms.System.q1.n5(var1)));
      }
   }

   private static com.aspose.slides.internal.o9b.p8 n5(
      String var0, com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.o9b.f2 var2, int var3, int var4
   ) {
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var6 = com.aspose.slides.internal.o9b.z1.n5(var5);
      com.aspose.slides.internal.o9b.e5 var7 = new com.aspose.slides.internal.o9b.e5();
      var7.n5(n5(var3));
      var7.l6(n5(var4));
      com.aspose.slides.internal.o9b.f2 var8 = var6.n5(var0, var1, var2.a6(), var7).a6();
      int var9 = g6z.n5(var8.l6());
      int var10 = g6z.n5(var8.k5());
      return new com.aspose.slides.internal.o9b.p8(var9, var10);
   }

   private static com.aspose.slides.internal.o9b.f2 l6(
      String var0, com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.o9b.f2 var2, int var3, int var4
   ) {
      return n5(var0, var1, var2.a6(), var3, var4, com.aspose.slides.internal.o9b.e5.t2());
   }

   private static com.aspose.slides.internal.o9b.f2 n5(
      String var0, com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.o9b.f2 var2, int var3, int var4, com.aspose.slides.internal.o9b.e5 var5
   ) {
      com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var7 = com.aspose.slides.internal.o9b.z1.n5(var6);
      com.aspose.slides.internal.o9b.e5 var8 = new com.aspose.slides.internal.o9b.e5(var5);
      var8.n5(n5(var3));
      var8.l6(n5(var4));
      return var7.n5(var0, var1, var2.a6(), var8).a6();
   }

   private static com.aspose.slides.internal.o9b.p8 n5(com.aspose.slides.internal.o9b.f2 var0, com.aspose.slides.internal.o9b.f2 var1, int var2) {
      double var3 = com.aspose.slides.ms.System.q1.n5(var2 % 90) / 180.0 * Math.PI;
      double var5 = var0.l6() * com.aspose.slides.ms.System.q1.c8(var3) + var0.k5() * com.aspose.slides.ms.System.q1.h0(var3);
      double var7 = var0.l6() * com.aspose.slides.ms.System.q1.h0(var3) + var0.k5() * com.aspose.slides.ms.System.q1.c8(var3);
      if (var5 > var1.l6()) {
         var7 = var1.l6() * var7 / var5;
         var5 = var1.l6();
      }

      if (var7 > var1.k5()) {
         var5 = var1.k5() * var5 / var7;
         var7 = var1.k5();
      }

      return new com.aspose.slides.internal.o9b.p8(g6z.n5(var5), g6z.n5(var7));
   }

   static com.aspose.slides.internal.o9b.p8 n5(String var0, com.aspose.slides.internal.o9b.n3 var1) {
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var3 = com.aspose.slides.internal.o9b.z1.n5(var2);
      com.aspose.slides.internal.o9b.f2 var4 = var3.n5(var0, var1).a6();
      int var5 = g6z.n5(var4.l6());
      int var6 = g6z.n5(var4.k5());
      return new com.aspose.slides.internal.o9b.p8(var5, var6);
   }

   public static com.aspose.slides.internal.o9b.p8 l6(
      String var0, int var1, com.aspose.slides.internal.o9b.n3 var2, com.aspose.slides.internal.o9b.p8 var3, int var4, int var5
   ) {
      com.aspose.slides.internal.o9b.f2 var6 = new com.aspose.slides.internal.o9b.f2(var3.l6(), var3.k5());
      return k5(var0, var1, var2, var6.a6(), var4, var5);
   }

   public static com.aspose.slides.internal.o9b.p8 k5(
      String var0, int var1, com.aspose.slides.internal.o9b.n3 var2, com.aspose.slides.internal.o9b.f2 var3, int var4, int var5
   ) {
      switch (com.aspose.slides.ms.System.q1.n5(var1)) {
         case 0:
            return k5(var0, var2, var3.a6(), var4, var5).u3();
         case 90:
            com.aspose.slides.internal.o9b.p8 var6 = k5(
                  var0,
                  var2,
                  new com.aspose.slides.internal.o9b.f2(
                     com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13), com.aspose.slides.internal.v6g.k5.u3(var3.l6(), 13)
                  ),
                  var4,
                  var5
               )
               .u3();
            return new com.aspose.slides.internal.o9b.p8(var6.k5(), var6.l6());
         default:
            com.aspose.slides.internal.o9b.l6 var7 = new com.aspose.slides.internal.o9b.l6(1, 1);
            com.aspose.slides.internal.o9b.z1 var8 = com.aspose.slides.internal.o9b.z1.n5(var7);
            com.aspose.slides.internal.o9b.f2 var9 = var8.n5(
                  var0, var2, new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F), new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2())
               )
               .a6();
            return n5(var9.a6(), var3.a6(), com.aspose.slides.ms.System.q1.n5(var1));
      }
   }

   private static com.aspose.slides.internal.o9b.p8 k5(
      String var0, com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.o9b.f2 var2, int var3, int var4
   ) {
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var6 = com.aspose.slides.internal.o9b.z1.n5(var5);
      com.aspose.slides.internal.o9b.e5 var7 = new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2());
      var7.n5(0.0F, new float[]{100.0F});
      var7.n5(n5(var3));
      var7.l6(n5(var4));
      com.aspose.slides.internal.o9b.f2 var8 = var6.n5(var0, var1, var2.a6(), var7).a6();
      int var9 = g6z.n5(var8.l6());
      int var10 = g6z.n5(var8.k5());
      return new com.aspose.slides.internal.o9b.p8(var9, var10);
   }

   public static com.aspose.slides.internal.o9b.f2 l6(String var0, com.aspose.slides.internal.o9b.n3 var1) {
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var3 = com.aspose.slides.internal.o9b.z1.n5(var2);
      com.aspose.slides.internal.o9b.e5 var4 = new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2());
      com.aspose.slides.internal.o9b.f2 var5 = var3.n5(var0, var1, Integer.MAX_VALUE, var4).a6();
      int var6 = g6z.n5(var5.l6());
      int var7 = g6z.n5(var5.k5());
      return new com.aspose.slides.internal.o9b.f2(var6, var7);
   }

   public static com.aspose.slides.internal.o9b.f2 n5(String var0, com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.o9b.p8 var2) {
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2(var2.l6(), var2.k5());
      return n5(var0, var1, var3.a6());
   }

   public static com.aspose.slides.internal.o9b.f2 n5(String var0, com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.o9b.f2 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var4 = com.aspose.slides.internal.o9b.z1.n5(var3);
      var2 = new com.aspose.slides.internal.o9b.f2(var2.l6(), var2.k5());
      int var5 = g6z.n5(var1.n5(var4));
      if (var0 != null && var0.length() != 0) {
         com.aspose.slides.internal.r7c.c8 var6 = new com.aspose.slides.internal.r7c.c8("\\n");
         com.aspose.slides.internal.r7c.c8 var7 = new com.aspose.slides.internal.r7c.c8("^\\s{1,}$");
         if (var6.u3(var0) || !var7.u3(var0) && !var7.u3(com.aspose.slides.ms.System.d1.k5(var0, var0.length() - 1))) {
            com.aspose.slides.internal.o9b.e5 var20 = new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2());
            var20.k5(var20.k5() | 2048);
            com.aspose.slides.internal.o9b.f2 var21 = var4.n5(var0, var1, var2.a6(), var20).a6();
            boolean var22 = false;
            if (var21.k5() < var5 * 1.5F) {
               var0 = com.aspose.slides.ms.System.d1.n5(var0, "|");
               var2.n5(var2.l6() + var5);
               var4.n5(var0, var1, var2.a6(), var20).l6(var21);
               var22 = true;
            }

            int var23 = g6z.n5(var21.k5());
            if (var23 >= 1 && !(var21.l6() < 1.0F)) {
               int var24 = com.aspose.slides.internal.v6g.k5.u3(var21.l6() * 0.1, 14);
               if (var24 < 10) {
                  var24 = 10;
               }

               com.aspose.slides.internal.o9b.l6 var25 = new com.aspose.slides.internal.o9b.l6(var24, var23);
               com.aspose.slides.internal.o9b.z1 var26 = com.aspose.slides.internal.o9b.z1.n5(var25);
               float var15 = g6z.n5(var21.l6());
               if (!var22) {
                  var26.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
                  com.aspose.slides.internal.o9b.y1 var16 = new com.aspose.slides.internal.o9b.y1(var24 - var15, 0.0F, var15, var23);
                  var26.n5(var0, var1, com.aspose.slides.internal.o9b.a6.n5(), var16.y4(), var20);

                  for (int var17 = var24 - 1; var17 >= 0; var17--) {
                     var15--;
                     int var18 = 0;

                     while (var18 < var23 && (var25.l6(var17, var18).x8() & 255) == 255) {
                        var18++;
                     }

                     if (var18 < var23) {
                        var15++;
                        break;
                     }
                  }
               } else {
                  var26.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
                  var26.n5(var0, var1, com.aspose.slides.internal.o9b.a6.n5(), var24 - var15, 0.0F, var20);

                  for (int var27 = var24 - 1; var27 >= 0; var27--) {
                     var15--;
                     if ((var25.l6(var27, var5 / 2).x8() & 255) != 255) {
                        break;
                     }
                  }
               }

               if (var25 != null) {
                  var25.dispose();
               }

               if (var26 != null) {
                  var26.dispose();
               }

               return new com.aspose.slides.internal.o9b.f2(var15, var23);
            } else {
               return var21;
            }
         } else {
            com.aspose.slides.internal.o9b.f2 var8 = var4.n5(
                  var0, var1, new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F), new com.aspose.slides.internal.o9b.e5(2048)
               )
               .a6();
            if (var8.k5() > var5 * 1.5F) {
               return var8;
            }

            String var9 = "aaaaaaaaaa";
            String var10 = com.aspose.slides.ms.System.d1.n5(new String[]{var9, var0, var9});
            com.aspose.slides.internal.o9b.f2 var11 = new com.aspose.slides.internal.o9b.f2(2.1474836E9F, 2.1474836E9F);
            com.aspose.slides.internal.o9b.f2 var12 = n5(var9, var1, var11.a6()).a6();
            com.aspose.slides.internal.o9b.f2 var13 = n5(var10, var1, var11.a6()).a6();
            float var14 = var13.l6() - 2.0F * var12.l6() > 0.0F ? var13.l6() - 2.0F * var12.l6() : var5 / 5.0F;
            return new com.aspose.slides.internal.o9b.f2(var14, var8.k5());
         }
      } else {
         return new com.aspose.slides.internal.o9b.f2(0.0F, var5);
      }
   }

   public static int n5(int var0) {
      if (var0 == 1) {
         return 1;
      } else if (var0 == 7 || var0 == 9) {
         return 0;
      } else {
         return var0 != 0 && var0 != 8 ? 1 : 2;
      }
   }

   public static float n5(String var0, com.aspose.slides.internal.o9b.n3 var1, boolean var2) {
      com.aspose.slides.internal.r7c.c8 var3 = new com.aspose.slides.internal.r7c.c8("\\s+");
      String[] var4 = var3.n5(var0);
      float var5 = 0.0F;

      for (int var6 = 0; var6 < var4.length; var6++) {
         com.aspose.slides.internal.o9b.f2 var7 = new com.aspose.slides.internal.o9b.f2();
         if (var2) {
            l6(var4[var6], var1).l6(var7);
         } else {
            com.aspose.slides.internal.o9b.l6 var8 = new com.aspose.slides.internal.o9b.l6(1, 1);
            com.aspose.slides.internal.o9b.z1 var9 = com.aspose.slides.internal.o9b.z1.n5(var8);
            var9.n5(var4[var6], var1).l6(var7);
         }

         if (var7.l6() > var5) {
            var5 = var7.l6();
         }
      }

      return var5;
   }

   public static com.aspose.slides.internal.o9b.f2 k5(String var0, com.aspose.slides.internal.o9b.n3 var1) {
      com.aspose.slides.internal.o9b.p8 var2 = new com.aspose.slides.internal.o9b.p8(Integer.MAX_VALUE, Integer.MAX_VALUE);
      com.aspose.slides.internal.o9b.p8 var3 = n5(var0, var1).u3();
      com.aspose.slides.internal.o9b.f2 var4 = n5(var0, var1, var2.u3()).a6();
      return new com.aspose.slides.internal.o9b.f2(var3.l6() - var4.l6(), var3.k5() - var4.k5());
   }

   public static int n5(com.aspose.slides.internal.o9b.n3 var0) {
      com.aspose.slides.internal.o9b.l6 var1 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var2 = com.aspose.slides.internal.o9b.z1.n5(var1);
      return g6z.n5(var0.n5(var2));
   }

   static com.aspose.slides.internal.o9b.f2 n5(
      String var0, com.aspose.slides.internal.o9b.n3 var1, n1g var2, com.aspose.slides.internal.o9b.f2 var3, float var4
   ) {
      AutoShape var5 = n5(var0, var1, com.aspose.slides.internal.o9b.c8.u3.o8(), 1, 2, var2);
      var5.setX(0.0F);
      var5.setY(0.0F);
      TextFrame var6 = com.aspose.slides.internal.v6g.k5.n5(var5.getTextFrame(), TextFrame.class);
      s3z.l6(var6.u3);
      d2k var7 = var6.u3.k5().u3();
      switch (com.aspose.slides.internal.v6g.k5.u3(var4, 13)) {
         case 0:
            float var8 = n5(var0, var1, true);
            com.aspose.slides.internal.o9b.f2 var9 = new com.aspose.slides.internal.o9b.f2();
            if (var8 < var3.l6()) {
               var3.l6(var9);
            } else {
               var9 = new com.aspose.slides.internal.o9b.f2(var8, var3.k5());
            }

            var5.setWidth(var9.l6());
            var5.setHeight(var9.k5());
            return new com.aspose.slides.internal.o9b.f2(var7.n5, var7.l6);
         case 90:
            var5.setHeight(var3.l6());
            var5.setWidth(var3.k5());
            return new com.aspose.slides.internal.o9b.f2(var7.l6, var7.n5);
         default:
            var5.setWidth(var3.l6());
            var5.setHeight(var3.k5());
            com.aspose.slides.internal.o9b.f2 var10 = new com.aspose.slides.internal.o9b.f2(var7.n5, var7.l6);
            return com.aspose.slides.internal.o9b.p8.n5(n5(var10.a6(), var3.a6(), com.aspose.slides.internal.v6g.k5.u3(var4, 13)));
      }
   }
}
