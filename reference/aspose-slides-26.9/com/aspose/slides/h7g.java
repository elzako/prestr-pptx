package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class h7g {
   private IGroupShape n5;
   private com.aspose.slides.internal.x4g.m1 l6;
   private com.aspose.slides.internal.b5j.t9 k5;
   private com.aspose.slides.internal.b5j.n3 u3;
   private com.aspose.slides.internal.b5j.x8 a6;
   private com.aspose.slides.internal.b5j.u3 u9;
   private com.aspose.slides.internal.b5j.u9 h0;
   private n3m c8;
   private com.aspose.slides.internal.b5j.h0 t2;
   private com.aspose.slides.internal.o9b.y1 s7 = new com.aspose.slides.internal.o9b.y1();
   private com.aspose.slides.internal.o9b.f2 x8 = new com.aspose.slides.internal.o9b.f2();
   private Dictionary<String, IGenericDictionary<String, String>> n3 = new Dictionary<>();
   private boolean y4;
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9(
      "text", "tspan", "rawText", "image", "rect", "circle", "ellipse", "line", "polyline", "polygon", "path", "square", "round", "bevel"
   );

   public final com.aspose.slides.internal.b5j.x8 n5() {
      return this.a6;
   }

   public final com.aspose.slides.internal.b5j.n3 l6() {
      return this.u3;
   }

   public final com.aspose.slides.internal.b5j.u9 k5() {
      return this.h0;
   }

   public final com.aspose.slides.internal.b5j.u3 u3() {
      return this.u9;
   }

   public h7g() {
      this(new com.aspose.slides.internal.b5j.l6());
   }

   public h7g(com.aspose.slides.internal.b5j.u3 var1) {
      this.u9 = var1;
      this.t2 = new com.aspose.slides.internal.b5j.h0();
      this.a6 = new com.aspose.slides.internal.b5j.x8();
      this.h0 = new com.aspose.slides.internal.b5j.u9();
      this.u3 = new com.aspose.slides.internal.b5j.n3();
      this.k5 = new com.aspose.slides.internal.b5j.t9(this.u3);
      this.l6 = new com.aspose.slides.internal.x4g.m1();
   }

   public final void n5(IGroupShape var1, String var2, com.aspose.slides.internal.o9b.y1 var3) {
      if (var1 != null && !com.aspose.slides.ms.System.d1.n5(var2)) {
         this.n5 = var1;
         var3.a6(this.s7);
         com.aspose.slides.internal.d0e.s7 var4 = this.n5(var2);
         com.aspose.slides.internal.d0e.t2 var5 = var4.u9;
         if (var5 != null) {
            while (!"svg".equals(var5.u9) && var5.j5().n5() > 0) {
               var5 = var5.j5().l6(0);
            }

            if ("svg".equals(var5.u9)) {
               this.a6(var5);
            }

            this.n5(var5);
         }
      }
   }

   final boolean a6() {
      return this.y4;
   }

   final void n5(boolean var1) {
      this.y4 = var1;
   }

   private void n5(com.aspose.slides.internal.d0e.t2 var1) {
      for (int var2 = 0; var2 < var1.j5().n5(); var2++) {
         com.aspose.slides.internal.d0e.t2 var3 = var1.j5().l6(var2);
         if (com.aspose.slides.internal.b5j.y4.n5(var3)) {
            this.l6(var3);
            this.n5(var3);
         }
      }
   }

   private void l6(com.aspose.slides.internal.d0e.t2 var1) {
      String var2 = var1.l6.k5("visibility");
      if (!com.aspose.slides.ms.System.d1.u3("hidden", var2, (short)3) && !com.aspose.slides.ms.System.d1.u3("collapse", var2, (short)3)) {
         String var3 = var1.l6.k5("display");
         if (!com.aspose.slides.ms.System.d1.u3("none", var3, (short)3)) {
            switch (e2.n5(var1.u9)) {
               case 0:
                  this.c8 = new n3m(this);
                  this.c8.n5((com.aspose.slides.internal.j7h.u3)var1, this.x8.a6());
                  break;
               case 1:
                  this.c8.n5((com.aspose.slides.internal.j7h.u3)var1, this.x8.a6());
                  break;
               case 2:
                  if ("text".equals(var1.n5.u9) || "tspan".equals(var1.n5.u9)) {
                     this.c8.n5((com.aspose.slides.internal.j7h.n5)var1, this.x8.a6());
                  }
                  break;
               case 3:
                  this.k5(var1);
                  break;
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
                  this.u3(var1);
            }
         }
      }
   }

   private List<Long> n5(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.x4g.m1 var3) {
      List var4 = new List();
      var3.n5(var1);

      for (int var5 = 0; var5 < var1.length; var5++) {
         var1[var5].n5(var1[var5].l6() - var2.x8());
         var1[var5].l6(var1[var5].k5() - var2.n3());
         var4.addItem(com.aspose.slides.internal.v6g.k5.u9(var1[var5].l6() * 12700.0F, 13));
         var4.addItem(com.aspose.slides.internal.v6g.k5.u9(var1[var5].k5() * 12700.0F, 13));
      }

      return var4;
   }

   private void k5(com.aspose.slides.internal.d0e.t2 var1) {
      com.aspose.slides.internal.d8v.k5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.d8v.k5.class);
      if (var2 != null && !var2.f2()) {
         com.aspose.slides.internal.x4g.m1 var3 = this.l6.u9();
         if (var1.c4() != null) {
            var3.l6(this.k5.n5(var1.c4(), this.x8.a6()));
         }

         try {
            byte[] var4 = var2.n5(this.u9);
            if (var4 == null) {
               return;
            }

            PPImage var5 = new PPImage(this.n5.getPresentation(), var4);
            com.aspose.slides.internal.o9b.y1 var6 = var2.n5(this.u3, this.x8.a6()).y4();
            String var7 = null;
            String[] var8 = new String[]{var7};
            boolean var9 = var2.l6.n5("bounding-box-width", var8);
            var7 = var8[0];
            if (var9) {
               float var10 = this.u3.n5(com.aspose.slides.internal.b3z.a6.n5(var7, com.aspose.slides.internal.b3z.a6.k5(0.0F)), "", var2, this.x8.a6());
               if (var10 < var6.s7()) {
                  var6.l6(var10);
               }
            }

            var8[0] = var7;
            boolean var15 = var2.l6.n5("bounding-box-height", var8);
            var7 = var8[0];
            if (var15) {
               float var11 = this.u3.n5(com.aspose.slides.internal.b3z.a6.n5(var7, com.aspose.slides.internal.b3z.a6.k5(0.0F)), "", var2, this.x8.a6());
               if (var11 < var6.k5()) {
                  var6.n5(var11);
               }
            }

            this.n5
               .getShapes()
               .addPictureFrame(
                  5,
                  this.s7.x8() + var6.x8() * var3.n5()[0] + var3.u3(),
                  this.s7.n3() + var6.n3() * var3.n5()[3] + var3.a6(),
                  var6.s7() * var3.n5()[0],
                  var6.k5() * var3.n5()[3],
                  var5
               );
         } catch (RuntimeException var12) {
         }
      }
   }

   private void u3(com.aspose.slides.internal.d0e.t2 var1) {
      if (var1 != null) {
         com.aspose.slides.internal.x4g.m1 var2 = null;
         com.aspose.slides.internal.x4g.m1[] var3 = new com.aspose.slides.internal.x4g.m1[]{var2};
         com.aspose.slides.internal.x4g.s7 var4 = this.n5(var1, var3);
         var2 = var3[0];
         if (var4 != null && var4.h0() != 0) {
            com.aspose.slides.internal.o9b.y1 var5 = var4.n5(var2).y4();
            List var6 = new List();
            List var7 = this.n5(var4.a6(), var5.y4(), var2);

            for (int var8 = 0; var8 < var4.u9().length; var8++) {
               int var9 = var4.u9()[var8] & 255 & 7;
               if (var9 == 0) {
                  var6.addItem((byte)1);
               }

               if (var9 == 1) {
                  var6.addItem((byte)2);
               }

               if (var9 == 3) {
                  var6.addItem((byte)5);
                  var8 += 2;
               }

               if ((var4.u9()[var8] & 255 & 128) != 0) {
                  var6.addItem((byte)0);
               }
            }

            IAutoShape var12 = this.n5(var5.y4(), var1, var2.n5()[0]);
            j2x var13 = ((GeometryShape)var12).e2();
            var13.n5(0);
            q7g var10 = new q7g(var6, var7);
            var10.l6(com.aspose.slides.internal.v6g.k5.u9(var12.getHeight() * 12700.0F, 13));
            var10.n5(com.aspose.slides.internal.v6g.k5.u9(var12.getWidth() * 12700.0F, 13));
            var13.n5(new q7g[]{var10});
         }
      }
   }

   private IAutoShape n5(com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.d0e.t2 var2, float var3) {
      IAutoShape var4 = this.n5.getShapes().addAutoShape(5, this.s7.x8() + var1.x8(), this.s7.n3() + var1.n3(), var1.s7(), var1.k5());
      ((AutoShape)var4).m1();
      var4.getLineFormat().setWidth(this.n5(var2, var3));
      this.n5(var4.getLineFormat(), var2, var3);
      this.n5(var4.getLineFormat().getFillFormat(), var2);
      this.n5(var4.getFillFormat(), var4, var2);
      var4.getFillFormat().getSolidFillColor().getColorTransform().add(5, ((com.aspose.slides.internal.d0e.a6)var2).t9());
      var4.getLineFormat().getFillFormat().getSolidFillColor().getColorTransform().add(5, ((com.aspose.slides.internal.d0e.a6)var2).t2());
      return var4;
   }

   private com.aspose.slides.internal.d0e.s7 n5(String var1) {
      com.aspose.slides.internal.d0e.s7 var2 = com.aspose.slides.internal.n1n.l6.n5(var1);
      com.aspose.slides.internal.d0e.t2 var3 = var2.u9;
      com.aspose.slides.internal.b5j.y4.n5(var3, this.a6, this.u9);
      com.aspose.slides.internal.b5j.y4.n5(var3, this.a6);
      com.aspose.slides.internal.b5j.y4.n5(var3, this.t2, false);
      com.aspose.slides.internal.b5j.y4.n5(var3, this.u9, this.h0);
      if (this.h0.n5() != null) {
         IGenericEnumerator var4 = this.h0.n5().l6().iterator();

         try {
            while (var4.hasNext()) {
               com.aspose.slides.internal.k5.q0 var5 = (com.aspose.slides.internal.k5.q0)var4.next();
               this.t2.n5(var5.l6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      com.aspose.slides.internal.b5j.y4.n5(var3, false, this.n3);
      return var2;
   }

   private void a6(com.aspose.slides.internal.d0e.t2 var1) {
      com.aspose.slides.internal.o9b.f2 var2 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      String[] var3 = null;
      if (var1.l6.n5("viewBox")) {
         var3 = com.aspose.slides.ms.System.d1.n5(var1.l6.k5("viewBox"), new String[]{" ", ","}, 1);
      }

      if (((com.aspose.slides.internal.d8v.a6)var1).i1() != null) {
         com.aspose.slides.internal.o9b.f2[] var4 = new com.aspose.slides.internal.o9b.f2[]{var2};
         com.aspose.slides.internal.b5j.y4.n5(var1, this.u3, var4, ((com.aspose.slides.internal.d8v.a6)var1).i1());
         var4[0].l6(var2);
         var2.l6(this.x8);
      } else {
         ((com.aspose.slides.internal.d8v.a6)var1).n5(this.u3, new com.aspose.slides.internal.o9b.f2()).c8().l6(this.x8);
      }

      if (this.s7.u3()) {
         this.s7 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, this.x8.l6(), this.x8.k5());
      }

      this.l6 = new com.aspose.slides.internal.x4g.m1(this.s7.s7() / this.x8.l6(), 0.0F, 0.0F, this.s7.k5() / this.x8.k5(), 0.0F, 0.0F);
      if (var1.l6.n5("viewBox")) {
         String var11 = "xMidYMid";
         if (var3.length == 4) {
            this.u3.n5(this.u3.n5(var3[2], "viewBox", var1));
            this.u3.l6(this.u3.n5(var3[3], "viewBox", var1));
            com.aspose.slides.internal.x4g.m1 var5 = new com.aspose.slides.internal.x4g.m1();
            com.aspose.slides.internal.b3z.s7 var6 = ((com.aspose.slides.internal.d8v.a6)var1).i1();
            com.aspose.slides.internal.o9b.f2 var7 = new com.aspose.slides.internal.o9b.f2(
               (float)com.aspose.slides.ms.System.q1.l6((double)var2.l6()), (float)com.aspose.slides.ms.System.q1.l6((double)var2.k5())
            );
            com.aspose.slides.internal.o9b.y1 var8 = ((com.aspose.slides.internal.d8v.a6)var1).n5(this.u3, var2.a6()).y4();
            com.aspose.slides.internal.o9b.f2 var9 = (var6 != null ? var6.n5(this.u3).c8() : var7).a6();
            com.aspose.slides.internal.o9b.y1 var10 = com.aspose.slides.internal.b5j.y4.n5(
                  ((com.aspose.slides.internal.d8v.a6)var1).e5(),
                  new com.aspose.slides.internal.o9b.y1(com.aspose.slides.internal.o9b.w1.n5.u3(), var9.a6()),
                  var8.y4()
               )
               .y4();
            if (var6 != null) {
               var5.l6(-var6.n5(this.u3).x8(), -var6.n5(this.u3).n3(), 1);
            }

            var5.n5(var10.s7() / var9.l6(), var10.k5() / var9.k5(), 1);
            var5.l6(var10.x8(), var10.n3(), 1);
            this.l6.n5(var5, 1);
         }
      }
   }

   private com.aspose.slides.internal.x4g.s7 n5(com.aspose.slides.internal.d0e.t2 var1, com.aspose.slides.internal.x4g.m1[] var2) {
      com.aspose.slides.internal.x4g.m1 var3 = this.l6.u9();
      if (var1.c4() != null) {
         var3.l6(this.k5.n5(var1.c4(), this.x8.a6()));
      }

      var2[0] = var3.u9();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z9u.n5.class)) {
         List var4 = ((com.aspose.slides.internal.z9u.n5)var1).l6(this.u3, this.x8.a6());
         return com.aspose.slides.internal.w9s.n5.n5(var4);
      } else {
         return null;
      }
   }

   final AutoShape n5(
      n3m var1, com.aspose.slides.internal.d0e.t2 var2, String var3, com.aspose.slides.internal.k2s.a6 var4, com.aspose.slides.internal.k2s.n5 var5
   ) {
      com.aspose.slides.internal.x4g.m1 var6 = null;
      com.aspose.slides.internal.x4g.m1[] var7 = new com.aspose.slides.internal.x4g.m1[]{var6};
      this.n5(var2, var7);
      var6 = var7[0];
      double var8 = com.aspose.slides.ms.System.q1.u3(var6.n5()[2], var6.n5()[0]);
      float var10 = -((float)(var8 * 180.0 / Math.PI));
      com.aspose.slides.internal.o9b.w1[] var11 = new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(var1.n5(), var1.l6() - ((com.aspose.slides.internal.n8e.a7)var5).n5().t2())
      };
      var6.n5(var11);
      IAutoShape var12 = this.n5.getShapes().addAutoShape(5, this.s7.x8() + var11[0].l6(), this.s7.n3() + var11[0].k5(), 1.0F, 1.0F);
      var12.setX(var12.getX() - (float)var12.getTextFrame().getTextFrameFormat().getEffective().getMarginLeft());
      var12.setY(var12.getY() - (float)var12.getTextFrame().getTextFrameFormat().getEffective().getMarginTop());
      ((AutoShape)var12).m1();
      var12.setRotation(var10);
      var12.getTextFrame().getTextFrameFormat().setAnchoringType((byte)0);
      var12.getTextFrame().getTextFrameFormat().setAutofitType((byte)2);
      var12.getTextFrame().getTextFrameFormat().setWrapText((byte)0);
      var12.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().setAlignment(0);
      var12.getTextFrame().getParagraphs().get_Item(0).getPortions().clear();
      this.n5(var12, var1, var2, var3, var4, var5);
      return (AutoShape)var12;
   }

   final void n5(
      IAutoShape var1,
      n3m var2,
      com.aspose.slides.internal.d0e.t2 var3,
      String var4,
      com.aspose.slides.internal.k2s.a6 var5,
      com.aspose.slides.internal.k2s.n5 var6
   ) {
      com.aspose.slides.internal.x4g.m1 var7 = null;
      com.aspose.slides.internal.x4g.m1[] var8 = new com.aspose.slides.internal.x4g.m1[]{var7};
      this.n5(var3, var8);
      var7 = var8[0];
      Portion var9 = new Portion();
      IPortionFormat var10 = var9.getPortionFormat();
      var10.setLatinFont(new FontData(var5.l6));
      double var11 = com.aspose.slides.ms.System.q1.u3(var7.n5()[2], var7.n5()[0]);
      float var13 = -((float)(var11 * 180.0 / Math.PI));
      float var14 = var5.a6;
      float var15 = var7.n5()[0];
      if (var3.c4() != null) {
         com.aspose.slides.internal.x4g.m1 var16 = new com.aspose.slides.internal.x4g.m1();
         var16.n5(var13);
         if (com.aspose.slides.ms.System.q1.n5((double)(var16.n5()[1]), 2) != 0.0) {
            var15 = (float)com.aspose.slides.ms.System.q1.n5((double)(var7.n5()[1] / var16.n5()[1]), 2);
         }
      }

      var10.setFontHeight(var14 * var15);
      this.n5((PortionFormat)var10, var3, var5, var7.n5()[0]);
      var9.setText(var4);
      float var23 = var1.getWidth();
      float var17 = var1.getHeight();
      var1.getTextFrame().getParagraphs().get_Item(0).getPortions().add(var9);
      if (var13 != 0.0F) {
         float var18 = var1.getWidth();
         float var19 = var1.getHeight();
         float var20 = (var18 - var23) / 2.0F;
         float var21 = (var19 - var17) / 2.0F;
         var1.setX(var1.getX() + var20 * (float)com.aspose.slides.ms.System.q1.c8(var11));
         var1.setY(var1.getY() - var21 * (float)com.aspose.slides.ms.System.q1.h0(var11));
      }
   }

   private void n5(PortionFormat var1, com.aspose.slides.internal.d0e.t2 var2, com.aspose.slides.internal.k2s.a6 var3, float var4) {
      var1.getLineFormat().setWidth(this.n5(var2, var4));
      this.n5(var1.getLineFormat().getFillFormat(), var2);
      this.n5(var1.getFillFormat(), null, var2);
      switch (var3.l6()) {
         case 1:
            var1.setFontBold((byte)1);
            break;
         case 2:
            var1.setFontItalic((byte)1);
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 4:
            var1.setFontUnderline((byte)2);
            break;
         case 8:
            var1.setStrikethroughType((byte)1);
      }

      if (var3.e2) {
         var1.setFontUnderline((byte)2);
      }

      if (var3.z1) {
         var1.setStrikethroughType((byte)1);
      }

      var1.setSpacing(var3.x8);
   }

   private double n5(com.aspose.slides.internal.d0e.t2 var1, float var2) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = this.n5(var1.l6, "stroke-width", var4);
      var3 = var4[0];
      return var5 ? this.u3.n5(var3, "", var1) * this.l6(var1, var2) : Double.NaN;
   }

   private float l6(com.aspose.slides.internal.d0e.t2 var1, float var2) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = this.n5(var1.l6, "vector-effect", var4) && "non-scaling-stroke".equals(var4[0]);
      var3 = var4[0];
      return var5 ? 1.0F : var2;
   }

   private void n5(ILineFormat var1, com.aspose.slides.internal.d0e.t2 var2, float var3) {
      String var4 = null;
      String[] var5 = new String[]{var4};
      boolean var6 = this.n5(var2.l6, "stroke-linecap", var5);
      var4 = var5[0];
      if (var6) {
         switch (e2.n5(var4)) {
            case 11:
               var1.setCapStyle((byte)1);
               break;
            case 12:
               var1.setCapStyle((byte)0);
               break;
            default:
               var1.setCapStyle((byte)2);
         }
      }

      String var7 = null;
      String[] var8 = new String[]{var7};
      boolean var9 = this.n5(var2.l6, "stroke-linejoin", var8);
      var7 = var8[0];
      if (var9) {
         switch (e2.n5(var7)) {
            case 12:
               var1.setJoinStyle((byte)0);
               break;
            case 13:
               var1.setJoinStyle((byte)1);
               break;
            default:
               var1.setJoinStyle((byte)2);
         }
      }

      String var10 = null;
      String[] var11 = new String[]{var10};
      boolean var12 = this.n5(var2.l6, "stroke-miterlimit", var11);
      var10 = var11[0];
      if (var12) {
         var1.setMiterLimit(this.u3.n5(var10, "", var2) * this.l6(var2, var3));
         if (var1.getMiterLimit() >= var1.getWidth() && var1.getJoinStyle() == -1) {
            var1.setJoinStyle((byte)2);
         }
      }

      if (this.a6()) {
         byte var13 = 0;
         byte var14 = 0;
         String var15 = null;
         String[] var16 = new String[]{var15};
         boolean var17 = this.n5(var2.l6, "marker-end", var16) && com.aspose.slides.ms.System.d1.t2(var16[0], "url");
         var15 = var16[0];
         if (var17) {
            com.aspose.slides.internal.w5i.k5 var18 = com.aspose.slides.internal.v6g.k5.n5(this.a6.n5(var15), com.aspose.slides.internal.w5i.k5.class);
            if (var18 != null) {
               byte[] var19 = new byte[]{0};
               byte[] var20 = new byte[]{0};
               var1.setEndArrowheadStyle(this.n5(var18, var19, var20));
               var13 = var19[0];
               var14 = var20[0];
               var1.setEndArrowheadWidth(var13);
               var1.setEndArrowheadLength(var14);
            }
         }

         String var30 = null;
         String[] var32 = new String[]{var30};
         boolean var33 = this.n5(var2.l6, "marker-start", var32) && com.aspose.slides.ms.System.d1.t2(var32[0], "url");
         var30 = var32[0];
         if (var33) {
            com.aspose.slides.internal.w5i.k5 var21 = com.aspose.slides.internal.v6g.k5.n5(this.a6.n5(var30), com.aspose.slides.internal.w5i.k5.class);
            if (var21 != null) {
               byte[] var22 = new byte[]{var13};
               byte[] var23 = new byte[]{var14};
               var1.setBeginArrowheadStyle(this.n5(var21, var22, var23));
               var13 = var22[0];
               var14 = var23[0];
               var1.setBeginArrowheadWidth(var13);
               var1.setBeginArrowheadLength(var14);
            }
         }
      }
   }

   private byte n5(com.aspose.slides.internal.d0e.t2 var1, byte[] var2, byte[] var3) {
      var2[0] = -1;
      var3[0] = -1;
      if (var1.j5().n5() == 0) {
         return -1;
      }

      com.aspose.slides.internal.d0e.t2 var4 = null;
      IGenericEnumerator var5 = var1.j5().iterator();

      try {
         while (var5.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var5.next();
            if (!"rawText".equals(((com.aspose.slides.internal.d0e.t2)var6.getValue()).u9)) {
               var4 = (com.aspose.slides.internal.d0e.t2)var6.getValue();
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (var4 == null) {
         return -1;
      }

      byte var17 = 1;
      if ("ellipse".equals(var4.u9) || "circle".equals(var4.u9)) {
         var17 = 4;
      }

      com.aspose.slides.internal.x4g.m1 var7 = null;
      com.aspose.slides.internal.x4g.m1[] var8 = new com.aspose.slides.internal.x4g.m1[]{var7};
      com.aspose.slides.internal.x4g.s7 var9 = this.n5(var4, var8);
      var7 = var8[0];
      if (var9 != null) {
         int var10 = var9.h0();
         if (var10 == 4) {
            if ((var9.u9()[var10 - 1] & 255) != 129) {
               var17 = 5;
            }
         } else if (var10 == 5) {
            if (com.aspose.slides.internal.o9b.w1.n5(var9.a6()[2], com.aspose.slides.internal.o9b.w1.n5)) {
               var17 = 2;
            } else {
               var17 = 3;
            }
         }

         com.aspose.slides.internal.o9b.y1 var11 = var9.n5(var7).y4();
         if (!var11.u3()) {
            float var12 = 3.99F;
            float var13 = 10.0F / var11.s7();
            float var14 = 10.0F / var11.k5();
            if (var13 < var12 - 1.0F) {
               var2[0] = 0;
            } else if (var13 < var12) {
               var2[0] = 1;
            } else {
               var2[0] = 2;
            }

            if (var14 < var12 - 1.0F) {
               var3[0] = 0;
            } else if (var14 < var12) {
               var3[0] = 1;
            } else {
               var3[0] = 2;
            }
         } else {
            var2[0] = 1;
            var3[0] = 1;
         }
      }

      return var17;
   }

   private void n5(ILineFillFormat var1, com.aspose.slides.internal.d0e.t2 var2) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = this.n5(var2.l6, "stroke", var4) && !"none".equals(var4[0]);
      var3 = var4[0];
      if (var5) {
         if (!com.aspose.slides.ms.System.d1.t2(var3, "url")) {
            var1.setFillType((byte)1);
            ((ColorFormat)var1.getSolidFillColor()).n5(com.aspose.slides.internal.b3z.u3.n5(var3).n5().o8());
         } else {
            com.aspose.slides.internal.d0e.t2 var6 = this.a6.n5(var3);

            while (var6.l6.n5("xlink:href")) {
               var6 = this.a6.n5(var6.l6.k5("xlink:href"));
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var6, com.aspose.slides.internal.w5i.n5.class)) {
               var1.setFillType((byte)1);
               ((ColorFormat)var1.getSolidFillColor()).n5(((com.aspose.slides.internal.w5i.n5)var6).i1().get_Item(0).d2().n5().o8());
            }
         }
      }
   }

   private void n5(IFillFormat var1, IShape var2, com.aspose.slides.internal.d0e.t2 var3) {
      String var4 = null;
      String[] var5 = new String[]{var4};
      boolean var6 = this.n5(var3.l6, "fill", var5);
      var4 = var5[0];
      if (var6) {
         if (!"none".equals(var4)) {
            if (!com.aspose.slides.ms.System.d1.t2(var4, "url")) {
               var1.setFillType((byte)1);
               ((ColorFormat)var1.getSolidFillColor()).n5(com.aspose.slides.internal.b3z.u3.n5(var4).n5().o8());
            } else {
               com.aspose.slides.internal.d0e.t2 var7 = this.a6.n5(var4);

               while (var7.l6.n5("xlink:href")) {
                  var7 = this.a6.n5(var7.l6.k5("xlink:href"));
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.w5i.n5.class)) {
                  this.n5(var1, (com.aspose.slides.internal.w5i.n5)var7, ((com.aspose.slides.internal.d0e.a6)var3).t9());
               } else if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.w5i.u3.class) && var2 != null) {
                  com.aspose.slides.internal.w5i.u3 var8 = (com.aspose.slides.internal.w5i.u3)var7;
                  com.aspose.slides.internal.o9b.t4 var9 = this.n5(var8, ((ShapeFrame)var2.getFrame()).n5().y4());
                  if (var9 != null) {
                     IPPImage var10 = ((ImageCollection)var2.getPresentation().getImages()).n5(var9);
                     var1.setFillType((byte)4);
                     var1.getPictureFillFormat().getPicture().setImage(var10);
                     var1.getPictureFillFormat().setPictureFillMode(1);
                  }
               }
            }
         }

         String var12 = null;
         String[] var14 = new String[]{var12};
         boolean var15 = this.n5(var3.l6, "fill-opacity", var14);
         var12 = var14[0];
         if (var15) {
            var1.getSolidFillColor().getColorTransform().add(5, (float)com.aspose.slides.ms.System.d2.n5(var12, com.aspose.slides.internal.x7n.l6.k5()));
         }
      } else if (var2 != null) {
         var2.getFillFormat().setFillType((byte)1);
         ((ColorFormat)var2.getFillFormat().getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      }
   }

   private void n5(IFillFormat var1, com.aspose.slides.internal.w5i.n5 var2, float var3) {
      com.aspose.slides.internal.w5i.l6 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.w5i.l6.class);
      if (var4 != null && this.a6()) {
         var1.setFillType((byte)2);
         var1.getGradientFormat().setGradientShape((byte)0);
         List$Enumerator var5 = var4.i1().iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.w5i.u9 var6 = (com.aspose.slides.internal.w5i.u9)var5.next();
               float var7 = var3 * var6.d5();
               com.aspose.slides.internal.o9b.c8 var8 = com.aspose.slides.internal.o9b.c8.n5(
                     com.aspose.slides.internal.v6g.k5.u3(var7 * 255.0F, 13), var6.d2().n5().o8()
                  )
                  .o8();
               ((GradientStopCollection)var1.getGradientFormat().getGradientStops()).n5(var6.a0(), var8.o8());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         var1.getGradientFormat().setLinearGradientAngle(com.aspose.slides.internal.w5i.l6.n5(var4.e5().n5(), var4.o0().n5(), var4.b3().n5(), var4.z7().n5()));
      } else {
         var1.setFillType((byte)1);
         ((ColorFormat)var1.getSolidFillColor()).n5(var2.i1().get_Item(0).d2().n5().o8());
      }
   }

   private com.aspose.slides.internal.o9b.t4 n5(com.aspose.slides.internal.w5i.u3 var1, com.aspose.slides.internal.o9b.y1 var2) {
      var1.n5(this.a6);
      boolean var3 = var1.a0() == 1;
      int var4 = this.u3.n5;
      this.u3.n5 = var3 ? 1 : 0;
      float var5 = this.u3.n5(var1.p8(), "width", var1, var2.c8().a6());
      float var6 = this.u3.n5(var1.f2(), "height", var1, var2.c8().a6());
      this.u3.n5 = var4;
      if (com.aspose.slides.ms.System.q1.n5(var5) < 0.001 && com.aspose.slides.ms.System.q1.n5(var6) < 0.001) {
         return null;
      }

      com.aspose.slides.internal.b3z.s7 var7 = var1.i1();
      boolean var8 = var7 != null;
      com.aspose.slides.internal.o9b.y1 var9 = (var8 ? var7.n5(this.u3) : var2).y4();
      com.aspose.slides.internal.x4g.m1 var10 = new com.aspose.slides.internal.x4g.m1();

      try {
         boolean var11 = var1.d2() == 1;
         if (var8) {
            float var12 = var5 / var9.s7();
            float var13 = var6 / var9.k5();
            var10.n5(var12, var13);
            var10.k5(-var9.x8(), -var9.n3());
         } else if (var11) {
            var10.n5(var2.s7(), var2.k5());
         } else {
            float var31 = var9.s7() / var5;
            float var33 = var9.k5() / var6;
            var10.n5(var31, var33);
            var5 *= 1.3333334F;
            var6 *= 1.3333334F;
         }

         com.aspose.slides.internal.l5.u3 var32 = new com.aspose.slides.internal.l5.u3(
            new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var5), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var6), 14)
            )
         );
         com.aspose.slides.internal.l5.u9 var34 = com.aspose.slides.internal.l5.u9.n5(var32);

         try {
            var34.n5(var10);
            var34.k5(2);
            var34.l6(2);
            if (var8) {
               var34.l6(new com.aspose.slides.internal.o9b.a0(var9.y4()));
            }

            com.aspose.slides.internal.w9s.u3 var14 = new com.aspose.slides.internal.w9s.u3(var34, null, this.a6, this.u3, this.h0, this.k5, this.u9);
            com.aspose.slides.internal.f5n.u3.n5(var14, var1, var2.c8().a6());
         } finally {
            if (var34 != null) {
               var34.dispose();
            }
         }

         com.aspose.slides.internal.l5.e2 var35 = new com.aspose.slides.internal.l5.e2(var32);
         com.aspose.slides.internal.l5.u3 var15 = new com.aspose.slides.internal.l5.u3(
            new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var2.s7()), 14),
               com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var2.k5()), 14)
            )
         );
         com.aspose.slides.internal.l5.u9 var16 = com.aspose.slides.internal.l5.u9.n5(var15);

         try {
            var16.n5(var35, new com.aspose.slides.internal.o9b.y1(new com.aspose.slides.internal.o9b.w1(), var2.c8().a6()));
         } finally {
            if (var16 != null) {
               var16.dispose();
            }
         }

         return var15.n5();
      } finally {
         if (var10 != null) {
            var10.dispose();
         }
      }
   }

   private boolean n5(com.aspose.slides.internal.d0e.k5 var1, String var2, String[] var3) {
      if (var1.n5(var2, var3)) {
         return true;
      }

      var3[0] = null;
      String var4 = null;
      String[] var5 = new String[]{var4};
      boolean var6 = !var1.n5("style", var5);
      var4 = var5[0];
      if (var6) {
         String var7 = null;
         String[] var8 = new String[]{var7};
         boolean var9 = var1.n5("class", var8);
         var7 = var8[0];
         if (var9) {
            var5[0] = var4;
            this.t2.n5().tryGetValue(com.aspose.slides.ms.System.d1.n5(new String[]{".", var7}), var5);
            var4 = var5[0];
         }
      }

      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         try {
            n9p var15 = w3o.l6(var4);

            for (l3a var11 : var15.l6()) {
               if (com.aspose.slides.ms.System.d1.a6(var11.n5(), var2)) {
                  var3[0] = var11.l6();
                  return true;
               }
            }
         } catch (RuntimeException var12) {
            return false;
         }
      }

      return false;
   }
}
