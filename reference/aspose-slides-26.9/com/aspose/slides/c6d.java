package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Arrays;

class c6d {
   public static void n5(Slide var0, com.aspose.slides.internal.k4y.i4x var1, x0a var2) {
      if (var0 == null) {
         throw new ArgumentNullException("slide");
      }

      if (var1 == null) {
         throw new ArgumentNullException("pageElementData");
      }

      l6(var0, var1, var2);
      IGenericEnumerator var3 = var0.getShapes().iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            var2.l6().t2().throwIfInterruptionRequested();
            k5a.n5(var4, new c6d$1(var1), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      k5(var0, var1, var2);
      n5(var0, var1);
      u3(var0, var1, var2);
   }

   public static void n5(IShapeCollection var0, g7$n5 var1, x0a var2) {
      if (var0 == null) {
         throw new ArgumentNullException("shapeCollection");
      }

      if (var1 == null) {
         throw new ArgumentNullException("addShapeDelegate");
      }

      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            var2.l6().t2().throwIfInterruptionRequested();
            k5a.n5(var4, var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void l6(Slide var0, com.aspose.slides.internal.k4y.i4x var1, x0a var2) {
      if (com.aspose.slides.ms.System.d1.n5(var0.getName())) {
         var0.setName(com.aspose.slides.ms.System.d1.n5(new String[]{"Slide_", com.aspose.slides.ms.System.l4.l6(var0.q0().u3())}));
      }

      var1.l6(var0.getName());
      var1.a6(com.aspose.slides.ms.System.d1.n5("Slide-{0}", new Object[]{var0.getSlideId()}));
      var1.u3(com.aspose.slides.ms.System.d1.n5(new String[]{var0.r4().getName(), "-", var0.w1().getName()}));
      com.aspose.slides.internal.k4y.y2i var3 = var2.n5("gp", 11);
      var1.k5(var3.n5());
      com.aspose.slides.internal.k4y.r9l var4 = (com.aspose.slides.internal.k4y.r9l)var3.n5("drawing-page-properties").l6();
      var4.a6((byte)0);
      var4.u9((byte)0);
      var4.u3((byte)0);
      var4.k5((byte)0);
      var4.n5(t2f.n5(var0.getShowMasterShapes()));
      if (var0.getHidden()) {
         var4.u3(2);
      }

      Background var5 = (Background)var0.getBackground();
      if (var5.getType() == -1 && var0.getLayoutSlide() != null) {
         var5 = (Background)var0.getLayoutSlide().getBackground();
         if (var5.getType() == -1 && var0.getLayoutSlide().getMasterSlide() != null) {
            var5 = (Background)var0.getLayoutSlide().getMasterSlide().getBackground();
         }
      }

      if (var5.getType() == 1 && var5.getFillFormat().getFillType() == 0) {
         var4.n5(3);
         var4.k5(com.aspose.slides.ms.System.d1.n5);
      } else {
         j2k.n5(var5.getEffective().getFillFormat(), new i4v(var4), var2.l6());
      }
   }

   private static void k5(Slide var0, com.aspose.slides.internal.k4y.i4x var1, x0a var2) {
      INotesSlide var3 = var0.getNotesSlideManager().getNotesSlide();
      if (var3 != null && var3.getShapes().size() != 0) {
         com.aspose.slides.internal.k4y.p0i var4 = var1.n5();
         IGenericEnumerator var5 = var3.getShapes().iterator();

         try {
            while (var5.hasNext()) {
               IShape var6 = (IShape)var5.next();
               var2.l6().t2().throwIfInterruptionRequested();
               IPlaceholder var7 = var6.getPlaceholder();
               if (var7 == null) {
                  k5a.n5(var6, new c6d$2(var4), var2);
               } else {
                  switch (var7.getType()) {
                     case 1:
                        AutoShape var21 = com.aspose.slides.internal.v6g.k5.n5(var6, AutoShape.class);
                        if (var21 == null) {
                           k5a.n5(var6, new c6d$3(var4), var2);
                        } else {
                           com.aspose.slides.internal.k4y.b4f var23 = k5a.l6(var21, new c6d$4(var4), var2);
                           k5a.n5(var21, var23, var2);
                           var23.n5(11);
                        }
                        break;
                     case 14:
                        com.aspose.slides.internal.k4y.h4i var8 = new com.aspose.slides.internal.k4y.h4i();
                        var8.n5(10);
                        var8.n5(var0.getSlideNumber() & 4294967295L);
                        String var9 = null;
                        String var10 = null;
                        String var11 = null;
                        String var12 = null;
                        String[] var13 = new String[]{var9};
                        String[] var14 = new String[]{var10};
                        String[] var15 = new String[]{var11};
                        String[] var16 = new String[]{var12};
                        t2f.n5(var6, var13, var14, var15, var16);
                        var9 = var13[0];
                        var10 = var14[0];
                        var11 = var15[0];
                        var12 = var16[0];
                        var8.n5(var9);
                        var8.l6(var10);
                        var8.k5(var11);
                        var8.u3(var12);
                        com.aspose.slides.internal.k4y.g7 var17 = var4.n5("page-thumbnail");
                        var17.n5(var8);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }
   }

   private static void n5(Slide var0, com.aspose.slides.internal.k4y.i4x var1) {
      IGenericEnumerator var2 = var0.getPresentation().getCommentAuthors().iterator();

      try {
         while (var2.hasNext()) {
            ICommentAuthor var3 = (ICommentAuthor)var2.next();
            String var4 = "n/a".equals(var3.getInitials()) ? null : var3.getName();
            IGenericEnumerator var5 = var3.getComments().iterator();

            try {
               while (var5.hasNext()) {
                  IComment var6 = (IComment)var5.next();
                  if (com.aspose.slides.ms.System.j8.l6(var6.getSlide(), var0)) {
                     com.aspose.slides.internal.k4y.p3p var7 = var1.l6();
                     var7.k5(var4);
                     var7.n5(t2f.n5(((Comment)var6).l6().l6()));
                     var7.l6(t2f.n5(((Comment)var6).l6().k5()));
                     var7.u3(((Comment)var6).n5().n5("yyyy-MM-ddTHH:mm:ss"));
                     String[] var8 = com.aspose.slides.ms.System.d1.n5(var6.getText(), '\n');

                     for (String var12 : var8) {
                        com.aspose.slides.internal.k4y.u1x var13 = new com.aspose.slides.internal.k4y.u1x();
                        var13.k5().addItem(new com.aspose.slides.internal.k4y.g7("_TEXT", var12));
                        var7.n5(new com.aspose.slides.internal.k4y.g7("p", var13));
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void u3(Slide var0, com.aspose.slides.internal.k4y.i4x var1, x0a var2) {
      String[] var3 = null;
      Presentation var4 = (Presentation)var0.getPresentation();
      String[][] var5 = new String[][]{var3};
      byte[] var6 = null;
      byte[][] var7 = new byte[][]{var6};
      int[] var8 = Presentation.n5((s4e)var4.t4(), var7);
      var6 = var7[0];
      var5[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var8, i7t.l6) && var6 != null && var6.length > 0) {
         var5[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var6), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var9 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var9 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var18) {
            var9 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var18);
         }
      }

      var3 = var5[0];
      if ((
            !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
               || com.aspose.slides.internal.n8e.j5.n5() == null
               || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
         )
         && !Arrays.equals(var8, i7t.k5)
         && !Arrays.equals(var9, com.aspose.slides.internal.n8e.z7.l6)) {
         com.aspose.slides.internal.o9b.f2 var10 = ((SlideSize)var0.getPresentation().getSlideSize()).n5().a6();
         double var11 = (var10.l6() - 504.8F) / 2.0;
         double var13 = (var10.k5() - 123.6F) / 2.0;
         com.aspose.slides.internal.k4y.b4f var15 = (com.aspose.slides.internal.k4y.b4f)var1.n5("frame").l6();
         com.aspose.slides.internal.k4y.y2i var16 = n5(var2);
         var15.l6(var16.n5());
         var15.h0(t2f.n5(var11));
         var15.c8(t2f.n5(var13));
         var15.t2("7in");
         var15.s7("1.7in");
         com.aspose.slides.internal.k4y.o2e var17 = (com.aspose.slides.internal.k4y.o2e)var15.n5("text-box").l6();
         n5(var3, var17, var2);
      }
   }

   private static void n5(String[] var0, com.aspose.slides.internal.k4y.o2e var1, x0a var2) {
      com.aspose.slides.internal.k4y.y2i var3 = l6(var2);
      com.aspose.slides.internal.k4y.y2i var4 = k5(var2);

      for (int var5 = 0; var5 < var0.length; var5++) {
         String var6 = var0[var5];
         com.aspose.slides.internal.k4y.u1x var7 = (com.aspose.slides.internal.k4y.u1x)var1.n5("p").l6();
         var7.l6(var3.n5());
         com.aspose.slides.internal.k4y.w5k var8 = (com.aspose.slides.internal.k4y.w5k)var7.n5(a3l.u9).l6();
         var8.l6(var4.n5());
         com.aspose.slides.internal.k4y.g7 var9 = var8.n5("_TEXT");
         var9.n5(var6);
      }
   }

   private static com.aspose.slides.internal.k4y.y2i n5(x0a var0) {
      com.aspose.slides.internal.k4y.y2i var1 = var0.n5("gr", 9);
      com.aspose.slides.internal.k4y.v5n var2 = (com.aspose.slides.internal.k4y.v5n)var1.n5("paragraph-properties").l6();
      var2.n5((byte)1);
      var2.u3(1);
      com.aspose.slides.internal.k4y.p3w var3 = (com.aspose.slides.internal.k4y.p3w)var1.n5("graphic-properties").l6();
      var3.u3(1);
      var3.m1("0.05in");
      var3.k7("0.05in");
      var3.m3("0.1in");
      var3.z8("0.1in");
      var3.l6(2);
      var3.k5(2);
      var3.u9(1);
      var3.n5(1);
      var3.n5((byte)1);
      var3.l6((byte)1);
      var3.z3("position size");
      var3.k5((byte)0);
      return var1;
   }

   private static com.aspose.slides.internal.k4y.y2i l6(x0a var0) {
      com.aspose.slides.internal.k4y.y2i var1 = var0.n5("P", 2);
      com.aspose.slides.internal.k4y.v5n var2 = (com.aspose.slides.internal.k4y.v5n)var1.n5("paragraph-properties").l6();
      var2.l6("150%");
      var2.n5(5);
      var2.k5("1in");
      var2.a6("0in");
      var2.a6("0in");
      var2.c8("0in");
      var2.u3("0in");
      var2.l6(2);
      var2.k5(4);
      var2.u3(1);
      return var1;
   }

   private static com.aspose.slides.internal.k4y.y2i k5(x0a var0) {
      com.aspose.slides.internal.k4y.y2i var1 = var0.n5("P", 1);
      com.aspose.slides.internal.k4y.j9d var2 = (com.aspose.slides.internal.k4y.j9d)var1.n5("text-properties").l6();
      var2.n5(1);
      var2.l6(1);
      var2.n5("#ff9999");
      var2.u3("none");
      var2.k5(1);
      var2.l6("auto");
      var2.k5("font-color");
      var2.a6("0% 100");
      var2.u9("Calibri");
      var2.t2("0.4in");
      var2.s7("0in");
      var2.x8("en");
      var2.n3("US");
      var2.a6(1);
      var2.y4("0.04in 0in 0pc #000000");
      var2.h0(1);
      var2.c8(1);
      var2.t2(2);
      var2.l6((byte)1);
      return var1;
   }
}
