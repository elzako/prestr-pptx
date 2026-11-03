package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class w3t {
   public static void n5(Paragraph var0, TextFrame var1, boolean var2, com.aspose.slides.internal.k4y.u0y[] var3, int var4, g7$n5 var5, x0a var6) {
      if (var0 == null) {
         throw new ArgumentNullException("paragraph");
      }

      if (var5 == null) {
         throw new ArgumentNullException("addPElementDelegate");
      }

      t3x var7 = var0.n5().t9();
      com.aspose.slides.internal.k4y.j1w var8 = null;
      com.aspose.slides.internal.k4y.u1x var12;
      if (var3[0] != null) {
         if (com.aspose.slides.ms.System.d1.n5(var0.u3())) {
            if (var3[0].a6().length == 0) {
               com.aspose.slides.internal.k4y.j1w[] var9 = new com.aspose.slides.internal.k4y.j1w[]{var8};
               com.aspose.slides.internal.k4y.a8r var10 = n5(var0, var0.getParagraphFormat().getDepth() + 1, var6, var9);
               var8 = var9[0];
               var3[0].n5(var10.n5());
               com.aspose.slides.internal.k4y.f0w var11 = var3[0].n5();
               var12 = (com.aspose.slides.internal.k4y.u1x)var11.n5("p").l6();
            } else {
               com.aspose.slides.internal.k4y.b2k var23 = var3[0].a6()[var3[0].a6().length - 1];
               var12 = (com.aspose.slides.internal.k4y.u1x)var23.n5("p").l6();
            }
         } else {
            int var24 = var0.getParagraphFormat().getDepth() + 1;
            com.aspose.slides.internal.k4y.j1w[] var26 = new com.aspose.slides.internal.k4y.j1w[]{var8};
            com.aspose.slides.internal.k4y.a8r var28 = n5(var0, var24, var6, var26);
            var8 = var26[0];
            com.aspose.slides.internal.k4y.b2k var13 = n5(var24, var4, var3, var28);
            var12 = (com.aspose.slides.internal.k4y.u1x)var13.n5("p").l6();
         }
      } else {
         var12 = (com.aspose.slides.internal.k4y.u1x)var5.n5("p").l6();
      }

      com.aspose.slides.internal.k4y.y2i var25 = var6.n5("P", 2);
      var12.l6(var25.n5());
      com.aspose.slides.internal.k4y.v5n var27 = (com.aspose.slides.internal.k4y.v5n)var25.n5("paragraph-properties").l6();
      var27.n5(q9k.c8.get_Item(var7.getAlignment()));
      if (var3[0] == null) {
         n5(var7, var27);
      } else {
         n5(var7, var8);
         if (com.aspose.slides.internal.v6g.k5.l6(var1.k5(), SmartArtShape.class)) {
            n5(var7, var27);
         }
      }

      if (!com.aspose.slides.ms.System.d2.k5(var7.getMarginRight())) {
         var27.a6(t2f.l6(var7.getMarginRight()));
      }

      float var29 = var7.getDefaultPortionFormat().getFontHeight();
      if ((var7.getSpaceBefore() > 0.05F || var7.getSpaceAfter() > 0.05F) && var0.getPortions().getCount() > 0) {
         com.aspose.slides.internal.o9b.y1 var30 = ((Portion)var0.getPortions().get_Item(0)).n5.n5(true).y4();
         var29 = var30.k5();
      }

      if (!com.aspose.slides.ms.System.d2.k5(var7.getSpaceBefore())) {
         float var31 = j5u.a6(var7.getSpaceBefore(), var29);
         var27.h0(t2f.l6(var31));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var7.getSpaceAfter())) {
         float var32 = j5u.a6(var7.getSpaceAfter(), var29);
         var27.c8(t2f.l6(var32));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var7.getSpaceWithin())) {
         var27.l6(t2f.u9(var7.getSpaceWithin()));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var7.getDefaultTabSize()) && var7.getDefaultTabSize() > 0.0F) {
         var27.k5(t2f.l6(var7.getDefaultTabSize()));
      }

      ITabEffectiveData[] var33 = var7.getTabs();
      if (var33 != null && var33.length > 0) {
         com.aspose.slides.internal.k4y.e6f var14 = (com.aspose.slides.internal.k4y.e6f)var27.n5("tab-stops").l6();

         for (ITabEffectiveData var18 : var33) {
            com.aspose.slides.internal.k4y.e5i var19 = new com.aspose.slides.internal.k4y.e5i();
            var19.n5(t2f.l6(var18.getPosition()));
            var14.n5(var19);
         }
      }

      boolean var34 = var2 && com.aspose.slides.ms.System.d1.n5(var0.u3());
      IGenericEnumerator var35 = var0.getPortions().iterator();

      try {
         while (var35.hasNext()) {
            Portion var36 = (Portion)var35.next();
            u7e.n5(var36, var1, var34, var12, var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var35, IDisposable.class)) {
            var35.dispose();
         }
      }
   }

   private static void n5(IParagraphFormatEffectiveData var0, com.aspose.slides.internal.k4y.j1w var1) {
      if (var1 != null) {
         if (!com.aspose.slides.ms.System.d2.k5(var0.getIndent()) && !com.aspose.slides.ms.System.d2.k5(var0.getMarginLeft())) {
            float var2 = var0.getIndent() + var0.getMarginLeft();
            if (var2 != 0.0F) {
               var1.n5(t2f.l6(var2));
            }
         }

         if (!com.aspose.slides.ms.System.d2.k5(var0.getIndent())) {
            var1.l6(t2f.l6(var0.getIndent() * -1.0F));
         }
      }
   }

   private static void n5(IParagraphFormatEffectiveData var0, com.aspose.slides.internal.k4y.v5n var1) {
      if (!com.aspose.slides.ms.System.d2.k5(var0.getIndent())) {
         var1.u9(t2f.l6(var0.getIndent()));
      }

      if (!com.aspose.slides.ms.System.d2.k5(var0.getMarginLeft())) {
         var1.u3(t2f.l6(var0.getMarginLeft()));
      }
   }

   private static void n5(IParagraphFormat var0, Portion var1, com.aspose.slides.internal.k4y.j9d var2) {
      IPortionFormatEffectiveData var3 = var1.getPortionFormat().getEffective();
      if (var3.getFillFormat().getFillType() == 1) {
         var2.n5(t2f.n5(((f6a)var3.getFillFormat()).h0().o8()));
      }
   }

   static com.aspose.slides.internal.k4y.b2k n5(int var0, int var1, com.aspose.slides.internal.k4y.u0y[] var2, com.aspose.slides.internal.k4y.a8r var3) {
      var2[0].n5(var3.n5());
      if (var0 > 1 && var0 - var1 > 0) {
         com.aspose.slides.internal.k4y.b2k var4 = var2[0].l6();
         var2[0] = (com.aspose.slides.internal.k4y.u0y)var4.n5("list").l6();
         return n5(var0, var1 + 1, var2, var3);
      } else {
         return var2[0].l6();
      }
   }

   private static com.aspose.slides.internal.k4y.a8r n5(Paragraph var0, int var1, x0a var2, com.aspose.slides.internal.k4y.j1w[] var3) {
      var3[0] = null;
      com.aspose.slides.internal.k4y.a8r var4 = var2.n5("L");
      IParagraphFormatEffectiveData var5 = var0.getParagraphFormat().getEffective();
      switch (var5.getBullet().getType()) {
         case 1:
            var3[0] = n5(var0, var5, var1, var4);
            break;
         case 2:
            var3[0] = l6(var0, var5, var1, var4);
            break;
         case 3:
            n5(var0, var5, var1, var4, var2);
      }

      return var4;
   }

   private static com.aspose.slides.internal.k4y.j1w n5(Paragraph var0, IParagraphFormatEffectiveData var1, int var2, com.aspose.slides.internal.k4y.a8r var3) {
      com.aspose.slides.internal.k4y.v8w var4 = (com.aspose.slides.internal.k4y.v8w)var3.n5("list-level-style-bullet").l6();
      var4.n5(var2 & 4294967295L);
      var4.n5(var1.getBullet().getChar());
      com.aspose.slides.internal.k4y.j1w var5 = var4.n5();
      com.aspose.slides.internal.k4y.j9d var6 = var4.l6();
      var6.t2(t2f.a6(var1.getBullet().getHeight()));
      var6.u9(
         var1.getBullet().getFont().getFontName().charAt(0) != '+'
            ? com.aspose.slides.ms.System.d1.n5(new String[]{"'", var1.getBullet().getFont().getFontName(), "'"})
            : com.aspose.slides.ms.System.d1.n5(new String[]{"'", var1.getBullet().getFont().getFontName(var0.y4().getSlide().createThemeEffective()), "'"})
      );
      if (var1.getBullet().getFillFormat().getFillType() == 1) {
         var6.n5(t2f.n5(((f6a)var1.getBullet().getFillFormat()).h0().o8()));
      }

      return var5;
   }

   private static com.aspose.slides.internal.k4y.j1w l6(Paragraph var0, IParagraphFormatEffectiveData var1, int var2, com.aspose.slides.internal.k4y.a8r var3) {
      com.aspose.slides.internal.k4y.x8m var4 = (com.aspose.slides.internal.k4y.x8m)var3.n5("list-level-style-number").l6();
      var4.n5(var2 & 4294967295L);
      switch (var1.getBullet().getNumberedBulletStyle()) {
         case 0:
            var4.k5(".");
            var4.n5("a");
            break;
         case 1:
            var4.k5(".");
            var4.n5("A");
            break;
         case 2:
            var4.k5(")");
            var4.n5("1");
            break;
         case 3:
         case 29:
            var4.k5(".");
            var4.n5("1");
            break;
         case 4:
            var4.l6("(");
            var4.k5(")");
            var4.n5("i");
            break;
         case 5:
            var4.k5(")");
            var4.n5("i");
            break;
         case 6:
            var4.k5(".");
            var4.n5("i");
            break;
         case 7:
            var4.k5(".");
            var4.n5("I");
            break;
         case 8:
            var4.l6("(");
            var4.k5(")");
            var4.n5("a");
            break;
         case 9:
            var4.k5(")");
            var4.n5("a");
            break;
         case 10:
            var4.l6("(");
            var4.k5(")");
            var4.n5("A");
            break;
         case 11:
            var4.k5(")");
            var4.n5("A");
            break;
         case 12:
            var4.l6("(");
            var4.k5(")");
            var4.n5("1");
            break;
         case 13:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         default:
            var4.n5("");
            break;
         case 14:
            var4.l6("(");
            var4.k5(")");
            var4.n5("I");
            break;
         case 15:
            var4.k5(")");
            var4.n5("I");
            break;
         case 28:
            var4.n5("1");
      }

      var4.l6(var1.getBullet().getNumberedBulletStartWith() & 4294967295L);
      com.aspose.slides.internal.k4y.j1w var5 = var4.n5();
      com.aspose.slides.internal.k4y.j9d var6 = var4.l6();
      var6.t2(t2f.a6(var1.getBullet().getHeight()));
      if (var0.getParagraphFormat().getBullet().isBulletHardFont() == 1 && var1.getBullet().getFont().getFontName().length() > 0) {
         var6.u9(
            var1.getBullet().getFont().getFontName().charAt(0) != '+'
               ? com.aspose.slides.ms.System.d1.n5(new String[]{"'", var1.getBullet().getFont().getFontName(), "'"})
               : com.aspose.slides.ms.System.d1.n5(new String[]{"'", var1.getBullet().getFont().getFontName(var0.y4().getSlide().createThemeEffective()), "'"})
         );
      }

      if (var0.getParagraphFormat().getBullet().isBulletHardColor() == 1) {
         var6.n5(t2f.n5(((f6a)var1.getBullet().getFillFormat()).h0().o8()));
      } else if (var0.getPortions().getCount() > 0) {
         n5(var0.getParagraphFormat(), (Portion)var0.getPortions().get_Item(0), var6);
      }

      return var5;
   }

   private static void n5(Paragraph var0, IParagraphFormatEffectiveData var1, int var2, com.aspose.slides.internal.k4y.a8r var3, x0a var4) {
      IBulletFormatEffectiveData var5 = var1.getBullet();
      if (var5.getFillFormat().getFillType() == 4 && var5.getFillFormat().getPictureFillFormat().getPicture().getImage() != null) {
         PPImage var6 = (PPImage)var5.getFillFormat().getPictureFillFormat().getPicture().getImage();
         com.aspose.slides.internal.k4y.b5c var7 = (com.aspose.slides.internal.k4y.b5c)var3.n5("list-level-style-image").l6();
         var7.n5(var2 & 4294967295L);
         var7.n5(1);
         var7.l6(1);
         var7.k5(1);
         var7.n5(var4.l6().n5(var6));
         com.aspose.slides.internal.k4y.j1w var8 = var7.n5();
         var8.l6(2);
         var8.n5(8);
         var8.k5(t2f.n5((double)var6.getWidth()));
         var8.u3(t2f.n5((double)var6.getHeight()));
      }
   }
}
