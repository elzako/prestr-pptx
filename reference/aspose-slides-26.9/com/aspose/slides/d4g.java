package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class d4g {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "buClrTx", "buClr", "buFontTx", "buFont", "buSzTx", "buSzPct", "buSzPts", "buNone", "buAutoNum", "buChar", "buBlip", "spcPct", "spcPts"
   );

   public static void n5(IParagraphFormat var0, com.aspose.slides.internal.k4y.y4u var1, t5w var2) {
      if (var1 != null) {
         c6m var3 = ((ParagraphFormat)var0).t2();
         ((ParagraphFormat)var0).n5((short)var1.c8());
         var0.setSpaceWithin(n5(var1.t4()));
         var0.setSpaceBefore(n5(var1.q0()));
         var0.setSpaceAfter(n5(var1.z3()));
         com.aspose.slides.internal.k4y.g7 var4 = var1.m1();
         var0.getBullet().setBulletHardColor((byte)-1);
         if (var4 != null) {
            switch (n5.n5(var4.n5())) {
               case 0:
                  var0.getBullet().setBulletHardColor((byte)0);
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.z4 var5 = (com.aspose.slides.internal.k4y.z4)var4.l6();
                  var0.getBullet().setBulletHardColor((byte)1);
                  c4i.n5(var0.getBullet().getColor(), var5);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var4.n5(), "\""}));
            }
         }

         com.aspose.slides.internal.k4y.g7 var13 = var1.m3();
         var0.getBullet().setBulletHardFont((byte)-1);
         if (var13 != null) {
            switch (n5.n5(var13.n5())) {
               case 2:
                  var0.getBullet().setBulletHardFont((byte)0);
                  break;
               case 3:
                  com.aspose.slides.internal.k4y.q5v var6 = (com.aspose.slides.internal.k4y.q5v)var13.l6();
                  var0.getBullet().setBulletHardFont((byte)1);
                  if (com.aspose.slides.ms.System.d1.u3(var6.n5(), ',') != -1) {
                     String[] var7 = com.aspose.slides.ms.System.d1.n5(var6.n5(), ',');

                     for (String var11 : var7) {
                        String var12 = com.aspose.slides.ms.System.d1.l6(var11);
                        if (!com.aspose.slides.ms.System.d1.n5(var12)) {
                           var6.n5(var12);
                           break;
                        }
                     }
                  }

                  var0.getBullet().setFont(m9b.n5(var6));
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var13.n5(), "\""}));
            }
         }

         com.aspose.slides.internal.k4y.g7 var14 = var1.k7();
         if (var14 != null) {
            switch (n5.n5(var14.n5())) {
               case 4:
                  var0.getBullet().setHeight(100.0F);
                  break;
               case 5:
                  com.aspose.slides.internal.k4y.u0b var15 = (com.aspose.slides.internal.k4y.u0b)var14.l6();
                  var0.getBullet().setHeight(com.aspose.slides.ms.System.n1.k5(var15.n5()) ? 100.0F : var15.n5());
                  break;
               case 6:
                  com.aspose.slides.internal.k4y.c4i var17 = (com.aspose.slides.internal.k4y.c4i)var14.l6();
                  var0.getBullet().setHeight(com.aspose.slides.ms.System.n1.k5(var17.n5()) ? -10.0F : -var17.n5());
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var14.n5(), "\""}));
            }
         }

         com.aspose.slides.internal.k4y.g7 var16 = var1.z8();
         var0.getBullet().setType((byte)-1);
         if (var16 != null) {
            switch (n5.n5(var16.n5())) {
               case 7:
                  var0.getBullet().setType((byte)0);
                  break;
               case 8:
                  com.aspose.slides.internal.k4y.k4o var18 = (com.aspose.slides.internal.k4y.k4o)var16.l6();
                  var0.getBullet().setType((byte)2);
                  var0.getBullet().setNumberedBulletStyle(var18.n5());
                  var0.getBullet().setNumberedBulletStartWith((short)var18.l6());
                  break;
               case 9:
                  com.aspose.slides.internal.k4y.e2o var21 = (com.aspose.slides.internal.k4y.e2o)var16.l6();
                  var0.getBullet().setType((byte)1);
                  if (!com.aspose.slides.ms.System.d1.n5(var21.n5())) {
                     var0.getBullet().setChar(var21.n5().charAt(0));
                     ((BulletFormat)var0.getBullet()).n5(var21.n5());
                  }
                  break;
               case 10:
                  com.aspose.slides.internal.k4y.v4m var23 = (com.aspose.slides.internal.k4y.v4m)var16.l6();
                  var0.getBullet().setType((byte)3);
                  y2w.n5(((BulletFormat)var0.getBullet()).getPicture(), var23.n5(), var2);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var16.n5(), "\""}));
            }
         }

         if (var1.j5() != null) {
            for (com.aspose.slides.internal.k4y.h6t var25 : var1.j5().l6()) {
               var0.getTabs().add(com.aspose.slides.ms.System.d2.k5(var25.n5()) ? 0.0 : var25.n5(), var25.l6());
            }
         }

         w5d.n5(var0.getDefaultPortionFormat(), var1.w1(), var2);
         switch (var1.s7()) {
            case 0:
               var0.setAlignment(-1);
               break;
            case 1:
            default:
               var0.setAlignment(0);
               break;
            case 2:
               var0.setAlignment(1);
               break;
            case 3:
               var0.setAlignment(2);
               break;
            case 4:
               var0.setAlignment(3);
               break;
            case 5:
               var0.setAlignment(4);
               break;
            case 6:
               var0.setAlignment(5);
         }

         float var20 = var2.t4().length < 19 || (var2.t4()[19] & 255) != 46 && (var2.t4()[10] & 255) != 3 ? 4.084561F : (float)var1.u9();
         var0.setMarginLeft(var20);
         var0.setMarginRight((float)var1.h0());
         var0.setIndent((float)var1.t2());
         var0.setDefaultTabSize((float)var1.x8());
         var0.setFontAlignment(var1.e2());
         var0.setRightToLeft(var1.n3());
         var0.setEastAsianLineBreak(var1.y4());
         var0.setLatinLineBreak(var1.t9());
         var0.setHangingPunctuation(var1.z1());
      }
   }

   private static float n5(com.aspose.slides.internal.k4y.g3j var0) {
      if (var0 != null && var0.n5() != null) {
         com.aspose.slides.internal.k4y.g7 var1 = var0.n5();
         switch (n5.n5(var1.n5())) {
            case 11:
               com.aspose.slides.internal.k4y.z3b var2 = (com.aspose.slides.internal.k4y.z3b)var1.l6();
               return com.aspose.slides.ms.System.n1.k5(var2.n5()) ? 100.0F : var2.n5();
            case 12:
               com.aspose.slides.internal.k4y.r1q var3 = (com.aspose.slides.internal.k4y.r1q)var1.l6();
               return com.aspose.slides.ms.System.n1.k5(var3.n5()) ? -12.0F : -var3.n5();
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5(), "\""}));
         }
      } else {
         return Float.NaN;
      }
   }

   public static void n5(IParagraphFormat var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.y4u> var1, g6c var2) {
      c6m var3 = ((ParagraphFormat)var0).t2();
      if (!n5(var0)) {
         if (var3.n5()) {
            ((com.aspose.slides.internal.k4y.y4u)var1.invoke()).a6();
         }
      } else {
         com.aspose.slides.internal.k4y.y4u var4 = (com.aspose.slides.internal.k4y.y4u)var1.invoke();
         n5(new d4g$1(var4), var0.getSpaceWithin());
         n5(new d4g$2(var4), var0.getSpaceBefore());
         n5(new d4g$3(var4), var0.getSpaceAfter());
         BulletFormat var5 = (BulletFormat)var0.getBullet();
         n5(var5, var4);
         l6(var5, var4);
         k5(var5, var4);
         n5(var5, var0, var4, var2);
         if (((ParagraphFormat)var0).x8() > 0) {
            com.aspose.slides.internal.k4y.d0c var6 = var4.u3();
            IGenericEnumerator var7 = var0.getTabs().iterator();

            try {
               while (var7.hasNext()) {
                  ITab var8 = (ITab)var7.next();
                  com.aspose.slides.internal.k4y.h6t var9 = var6.n5();
                  var9.n5(var8.getPosition());
                  var9.n5(var8.getAlignment());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         }

         w5d.n5(var0.getDefaultPortionFormat(), new d4g$4(var4), var2);
         var4.n5(com.aspose.slides.internal.n8e.v4.n5(((ParagraphFormat)var0).u9(), -1, 8));
         var4.n5(com.aspose.slides.internal.n8e.v4.n5(var0.getMarginLeft(), 0.0F, 4032.0F));
         var4.l6(com.aspose.slides.internal.n8e.v4.n5(var0.getMarginRight(), 0.0F, 4032.0F));
         var4.k5(com.aspose.slides.internal.n8e.v4.n5(var0.getIndent(), -4032.0F, 4032.0F));
         switch (var0.getAlignment()) {
            case -1:
            default:
               break;
            case 0:
               var4.l6(1);
               break;
            case 1:
               var4.l6(2);
               break;
            case 2:
               var4.l6(3);
               break;
            case 3:
               var4.l6(4);
               break;
            case 4:
               var4.l6(5);
               break;
            case 5:
               var4.l6(6);
         }

         var4.u3(com.aspose.slides.internal.n8e.v4.n5(var0.getDefaultTabSize(), 0.0F, 4032.0F));
         var4.k5(var0.getFontAlignment());
         var4.n5(var0.getRightToLeft());
         var4.l6(var0.getEastAsianLineBreak());
         var4.k5(var0.getLatinLineBreak());
         var4.u3(var0.getHangingPunctuation());
      }
   }

   private static boolean n5(IParagraphFormat var0) {
      IBulletFormat var1 = var0.getBullet();
      return var1.getType() != -1
         || var1.isBulletHardColor() != -1
         || var1.getColor().getColorType() != -1
         || ((BulletFormat)var1).h0().n5() != -1
         || var1.isBulletHardFont() != -1
         || var1.getFont() != null
         || !com.aspose.slides.ms.System.n1.k5(var1.getHeight())
         || var1.getNumberedBulletStartWith() != -1
         || var0.getFontAlignment() != -1
         || var0.getAlignment() != -1
         || ((ParagraphFormat)var0).u9() != -1
         || !com.aspose.slides.ms.System.d2.k5(var0.getMarginLeft())
         || !com.aspose.slides.ms.System.d2.k5(var0.getMarginRight())
         || !com.aspose.slides.ms.System.d2.k5(var0.getIndent())
         || !com.aspose.slides.ms.System.d2.k5(var0.getDefaultTabSize())
         || !com.aspose.slides.ms.System.n1.k5(var0.getSpaceAfter())
         || !com.aspose.slides.ms.System.n1.k5(var0.getSpaceBefore())
         || !com.aspose.slides.ms.System.n1.k5(var0.getSpaceWithin())
         || var0.getEastAsianLineBreak() != -1
         || var0.getHangingPunctuation() != -1
         || var0.getLatinLineBreak() != -1
         || var0.getRightToLeft() != -1
         || ((ParagraphFormat)var0).x8() != 0
         || !((PortionFormat)var0.getDefaultPortionFormat()).y2();
   }

   private static void n5(BulletFormat var0, com.aspose.slides.internal.k4y.y4u var1) {
      if (var0.isBulletHardColor() == 1) {
         if (var0.getColor().getColorType() != -1) {
            com.aspose.slides.internal.k4y.z4 var2 = (com.aspose.slides.internal.k4y.z4)var1.l6("buClr").l6();
            c4i.l6(var0.getColor(), var2);
         }
      } else if (var0.isBulletHardColor() == 0) {
         var1.l6("buClrTx");
      }
   }

   private static void l6(BulletFormat var0, com.aspose.slides.internal.k4y.y4u var1) {
      if (!com.aspose.slides.ms.System.n1.k5(var0.getHeight())) {
         if (var0.getHeight() >= 0.0F && var0.getHeight() != 100.0F) {
            com.aspose.slides.internal.k4y.u0b var3 = (com.aspose.slides.internal.k4y.u0b)var1.k5("buSzPct").l6();
            if (var0.getHeight() > 0.0F) {
               var3.n5(com.aspose.slides.internal.n8e.v4.n5(var0.getHeight(), 25.0F, 400.0F));
            }
         } else if (var0.getHeight() < 0.0F) {
            com.aspose.slides.internal.k4y.c4i var2 = (com.aspose.slides.internal.k4y.c4i)var1.k5("buSzPts").l6();
            var2.n5(com.aspose.slides.internal.n8e.v4.n5(-var0.getHeight(), 1.0F, 1000.0F));
         } else {
            var1.k5("buSzTx");
         }
      }
   }

   private static void k5(BulletFormat var0, com.aspose.slides.internal.k4y.y4u var1) {
      if (var0.isBulletHardFont() == 1) {
         com.aspose.slides.internal.k4y.q5v var2 = (com.aspose.slides.internal.k4y.q5v)var1.u3("buFont").l6();
         m9b.n5(var0.getFont(), var2);
      } else if (var0.isBulletHardFont() == 0) {
         var1.u3("buFontTx");
      }
   }

   private static void n5(BulletFormat var0, IParagraphFormat var1, com.aspose.slides.internal.k4y.y4u var2, g6c var3) {
      switch (var0.getType()) {
         case -1:
         case 1:
            if (var3.c8() && !var0.s7() || !var3.c8() && var0.getType() == -1) {
               return;
            }

            com.aspose.slides.internal.k4y.e2o var4 = (com.aspose.slides.internal.k4y.e2o)var2.n5("buChar").l6();
            var4.n5(!var0.s7() ? "•" : var0.u3());
            break;
         case 0:
            var2.n5("buNone");
            break;
         case 2:
            com.aspose.slides.internal.k4y.k4o var5 = (com.aspose.slides.internal.k4y.k4o)var2.n5("buAutoNum").l6();
            if (var1.getBullet().getNumberedBulletStyle() != -1) {
               var5.n5(var1.getBullet().getNumberedBulletStyle());
            }

            if (var1.getBullet().getNumberedBulletStartWith() != -1) {
               var5.n5(var1.getBullet().getNumberedBulletStartWith());
            }
            break;
         case 3:
            com.aspose.slides.internal.k4y.v4m var6 = (com.aspose.slides.internal.k4y.v4m)var2.n5("buBlip").l6();
            if (((BulletFormat)var1.getBullet()).getPicture() != null) {
               y2w.n5(((BulletFormat)var1.getBullet()).getPicture(), var6.n5(), var3);
            }
      }
   }

   private static void n5(com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.g3j> var0, float var1) {
      if (!com.aspose.slides.ms.System.n1.k5(var1)) {
         com.aspose.slides.internal.k4y.g3j var2 = (com.aspose.slides.internal.k4y.g3j)var0.invoke();
         if (var1 < 0.0F) {
            com.aspose.slides.internal.k4y.r1q var3 = (com.aspose.slides.internal.k4y.r1q)var2.n5("spcPts").l6();
            var3.n5(-var1);
         } else {
            com.aspose.slides.internal.k4y.z3b var4 = (com.aspose.slides.internal.k4y.z3b)var2.n5("spcPct").l6();
            var4.n5(var1);
         }
      }
   }
}
