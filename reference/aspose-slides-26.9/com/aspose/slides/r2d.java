package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class r2d extends com.aspose.slides.internal.w5.u3 {
   private final List<Slide> n5;
   private final List<com.aspose.slides.internal.j3.z8> l6;
   private final f7s k5;
   private final String u3;
   private final Presentation a6;
   private LayoutSlide u9;
   private final com.aspose.slides.internal.o9b.f2 h0 = new com.aspose.slides.internal.o9b.f2();
   private com.aspose.slides.internal.o9b.w1 c8 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.ms.System.r8 t2;
   private AutoShape s7;
   private com.aspose.slides.internal.w8.e2 x8;
   private Slide n3;

   public r2d(Presentation var1, f7s var2, String var3) {
      this.n5 = new List<>();
      this.l6 = new List<>();
      this.a6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      ((SlideSize)var1.getSlideSize()).n5().l6(this.h0);
      this.c8 = new com.aspose.slides.internal.o9b.w1(12.0F, 12.0F);
      IGenericEnumerator var4 = this.a6.getMasters().get_Item(0).getLayoutSlides().iterator();

      try {
         while (var4.hasNext()) {
            LayoutSlide var5 = (LayoutSlide)var4.next();
            if (var5.getLayoutType() == 11) {
               this.u9 = var5;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.u9 == null) {
         this.u9 = (LayoutSlide)this.a6.getMasters().get_Item(0).getLayoutSlides().get_Item(0);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.c8 var1) {
      com.aspose.slides.internal.o9b.c8 var2 = var1.a3().c8().n5().o8();
      if (com.aspose.slides.internal.o9b.c8.l6(var2, com.aspose.slides.internal.o9b.c8.n5(0, 255, 255, 255))) {
         IBackground var3 = this.a6().getBackground();
         ((ColorFormat)var3.getFillFormat().getSolidFillColor()).n5(var2.o8());
         var3.getFillFormat().setFillType((byte)1);
         var3.setType((byte)1);
      }
   }

   @Override
   public void h0(com.aspose.slides.internal.w5.k5 var1) {
      if (!"main".equals(var1.t2()) && !"header".equals(var1.t2())) {
         if ("span".equals(com.aspose.slides.ms.System.d1.u9(var1.t2())) && var1.a3().k7().h0() == 6) {
            this.t2(var1);
         } else {
            if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.w8.e2.class)) {
               this.x8 = (com.aspose.slides.internal.w8.e2)var1;
               this.s7 = null;
            } else {
               this.n5(var1, m1j.u3(var1));
            }
         }
      }
   }

   @Override
   public void k5(com.aspose.slides.internal.w5.k5 var1) {
      this.n5(var1, false);
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.b3 var1) {
      this.n5(var1, false);
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.f5 var1) {
      this.n5(var1, false);
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.a6 var1) {
      this.n5(var1, false);
   }

   @Override
   public void a6(com.aspose.slides.internal.w5.k5 var1) {
      this.n5(var1, true);
   }

   @Override
   public com.aspose.slides.internal.w5.a6 t2(com.aspose.slides.internal.w5.k5 var1) {
      this.s7 = null;
      if (this.l6.containsItem(var1)) {
         return this;
      }

      this.l6(var1, true);
      com.aspose.slides.internal.j4.n5 var2 = new com.aspose.slides.internal.j4.n5();
      var2.n5(this.u3);
      com.aspose.slides.internal.z5.l6 var3 = new com.aspose.slides.internal.z5.l6();
      var3.h0()
         .a6()
         .n5(new com.aspose.slides.internal.z5.t2(new com.aspose.slides.internal.z5.a6(this.h0.l6(), 4), new com.aspose.slides.internal.z5.a6(this.h0.k5(), 4)));
      com.aspose.slides.internal.z5.a6 var4 = new com.aspose.slides.internal.z5.a6(12.0F, 4);
      var3.h0().a6().l6().u3(var4);
      var3.h0().a6().l6().n5(var4);
      var3.h0().a6().l6().l6(var4);
      var3.h0().a6().l6().k5(var4);
      com.aspose.slides.internal.z5.n5 var5 = new com.aspose.slides.internal.z5.n5(var2, new r9l(this.k5));
      String var6 = com.aspose.slides.ms.System.d1.n5(
         "<div style=\"height: ",
         com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3((this.c8.k5() - 12.0F) / 0.75F, 13)),
         "\"/></div>",
         var1.z1()
      );
      com.aspose.slides.internal.z5.k5 var7 = var5.n5(com.aspose.slides.ms.System.d1.n5(var6, "border-collapse: collapse", ""), var3);
      e8x var8 = new e8x(this.a6, this.k5, this.u3, var7.l6());
      boolean var9 = var7.n5().length > 1;

      for (com.aspose.slides.internal.e1.w1 var13 : var7.n5()) {
         if (var8.c8() > 0) {
            this.k5();
         }

         var8.n5(this.a6());
         var8.l6(var13);
         IGenericEnumerator var14 = var8.s7().getValues().iterator();

         try {
            while (var14.hasNext()) {
               v4l var15 = (v4l)var14.next();
               Table var16 = var15.n5((ShapeCollection)this.a6().getShapes(), var9);
               var16.n5(new d2k(this.c8.l6(), this.c8.k5()));
               this.c8.l6(this.c8.k5() + (var16.getHeight() + 6.0F));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
               var14.dispose();
            }
         }

         var8.n5().clear();
         var8.s7().clear();
         var8.x8().clear();
         var8.n5(var8.c8() + 1);
      }

      return this;
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.r4 var1) {
      if (!this.l6.containsItem(var1)) {
         this.l6.addItem(var1);
         this.s7 = null;
         String var2 = this.l6(var1.v3());
         if (!com.aspose.slides.ms.System.d1.n5(var2)) {
            if (this.c8.k5() >= this.h0.k5() - 12.0F) {
               this.k5();
            }

            IPPImage var3 = null;

            try {
               var3 = this.n5(var2);
            } catch (RuntimeException var12) {
               com.aspose.slides.internal.n8e.v4.n5(var12);
            }

            float var4 = var1.i9() * 0.75F;
            float var5 = var1.j8() * 0.75F;
            if (var4 == 0.0F) {
               var4 = var3 != null ? var3.getWidth() * 0.75F : 1.0F;
            }

            if (var5 == 0.0F) {
               var5 = var3 != null ? var3.getHeight() * 0.75F : 1.0F;
            }

            com.aspose.slides.internal.o9b.f2 var6 = new com.aspose.slides.internal.o9b.f2(this.h0.l6() - 24.0F, this.h0.k5() - 24.0F);
            if (var4 > var6.l6()) {
               float var7 = var6.l6() / var4;
               var4 *= var7;
               var5 *= var7;
            }

            float var13 = this.h0.k5() - this.c8.k5() - 12.0F;
            if (var5 > var6.k5()) {
               if (var13 < var5 * 0.4F) {
                  this.k5();
                  var13 = var6.k5();
               }
            } else {
               var13 = var5;
            }

            float var8 = 0.0F;
            float var9 = 0.0F;

            do {
               if (this.h0.k5() - this.c8.k5() - 12.0F < var13) {
                  this.k5();
               }

               IPictureFrame var10 = this.a6().getShapes().addPictureFrame(5, this.c8.l6(), this.c8.k5(), var4, var13, var3);
               var8 += var13;
               float var11 = (1.0F - var8 / var5) * 100.0F;
               var10.getPictureFormat().setCropTop(var9);
               var10.getPictureFormat().setCropBottom(var11);
               var9 = 100.0F - var11;
               this.c8.l6(this.c8.k5() + (var13 + 12.0F));
               var13 = com.aspose.slides.ms.System.q1.l6(var5 - var8, var6.k5());
            } while (var8 < var5);
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.j3.c4 var1) {
      String var2 = var1.n5();
      if (com.aspose.slides.ms.System.d1.n5(var2, x3s.n5) < 0 || com.aspose.slides.ms.System.d1.l6(var2).length() != 0) {
         this.n5(var1, true);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w8.u9 var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var1.j9())) {
         com.aspose.slides.ms.System.r8 var2 = null;
         com.aspose.slides.ms.System.r8[] var3 = new com.aspose.slides.ms.System.r8[]{var2};
         boolean var4 = com.aspose.slides.ms.System.r8.n5(var1.j9(), 0, var3);
         var2 = var3[0];
         if (var4) {
            this.t2 = var2;
         }
      }
   }

   @Override
   public void c8(com.aspose.slides.internal.w5.k5 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.w8.e2.class)) {
         this.s7 = null;
         this.x8 = null;
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.w8.c8 var1) {
      this.s7 = null;
      this.x8 = null;
   }

   private void n5(com.aspose.slides.internal.j3.z8 var1, boolean var2) {
      if (!this.l6.containsItem(var1)) {
         this.l6(var1, true);
         float var3 = this.c8.k5();
         if (this.s7 == null) {
            this.u3();
         } else {
            var3 = this.s7.getY();
         }

         ParagraphCollection var4 = (ParagraphCollection)this.s7.getTextFrame().getParagraphs();
         x3s var5 = new x3s(var4, this.k5, this.u3, true);
         if (var2) {
            com.aspose.slides.internal.w5.k5 var6 = com.aspose.slides.internal.v6g.k5.n5(var1.v4(), com.aspose.slides.internal.w5.k5.class);
            if (var6 == null) {
               com.aspose.slides.internal.j3.c4 var7 = com.aspose.slides.internal.v6g.k5.n5(var1.v4(), com.aspose.slides.internal.j3.c4.class);
               if (var7 != null && com.aspose.slides.ms.System.d1.l6(var7.n5()).length() == 0) {
                  var6 = com.aspose.slides.internal.v6g.k5.n5(var7.v4(), com.aspose.slides.internal.w5.k5.class);
               }
            }

            if (var6 != null && m1j.t2(var6)) {
               var5.n5(var4.get_Item(var4.getCount() - 1).getParagraphFormat());
            }
         }

         if (this.n5(var1)) {
            List var11 = new List();
            float[] var13 = new float[]{var3};
            List[] var8 = new List[]{var11};
            var5 = this.n5((com.aspose.slides.internal.h6.n5)var1, (com.aspose.slides.internal.h6.n5)var1, var5, var13, var8);
            var3 = var13[0];
            var11 = var8[0];
            if (var11.size() > 0) {
               var5.n5((com.aspose.slides.internal.h6.n5)var1, var11);
               this.n5(var3, false);
            }
         } else {
            var5.n5((com.aspose.slides.internal.f5.r4)var1);
            this.n5(var3, false);
         }
      }
   }

   private x3s n5(
      com.aspose.slides.internal.h6.n5 var1, com.aspose.slides.internal.h6.n5 var2, x3s var3, float[] var4, List<com.aspose.slides.internal.j3.z8>[] var5
   ) {
      x3s var6 = var3;
      IGenericEnumerator var7 = var2.y1().iterator();

      try {
         while (var7.hasNext()) {
            com.aspose.slides.internal.j3.z8 var8 = (com.aspose.slides.internal.j3.z8)var7.next();
            com.aspose.slides.internal.h6.n5 var9 = com.aspose.slides.internal.v6g.k5.n5(var8, com.aspose.slides.internal.h6.n5.class);
            if (var9 != null) {
               if (m1j.n5(var9)) {
                  if (var5[0].size() > 0) {
                     var6.n5(var1, var5[0]);
                  }

                  this.n5(var4[0], true);
                  this.n5(com.aspose.slides.internal.v6g.k5.n5(var9, com.aspose.slides.internal.w8.r4.class));
                  this.u3();
                  var4[0] = this.s7.getY();
                  var6 = new x3s((ParagraphCollection)this.s7.getTextFrame().getParagraphs(), this.k5, this.u3, true);
                  var5[0].clear();
               } else if (this.n5(var9)) {
                  var6 = this.n5(var1, var9, var6, var4, var5);
               } else {
                  var5[0].addItem(var8);
               }
            } else {
               var5[0].addItem(var8);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return var6;
   }

   private boolean n5(com.aspose.slides.internal.j3.z8 var1) {
      IGenericEnumerator var2 = var1.y1().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.j3.z8 var3 = (com.aspose.slides.internal.j3.z8)var2.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.w8.r4.class) || this.n5(var3)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   private void n5(float var1, boolean var2) {
      if (this.s7 != null) {
         ParagraphCollection var3 = (ParagraphCollection)this.s7.l6().getParagraphs();
         if (var3.getCount() != 0 && (!var2 || var3.getCount() != 1 || var3.get_Item(0).getPortions().getCount() != 0)) {
            IParagraph var4 = null;
            IParagraph[] var5 = new IParagraph[]{var4};
            this.n5(var1, var5);
            var4 = var5[0];
            float var6 = var4.getParagraphFormat().getSpaceAfter() * 2.0F;
            if (com.aspose.slides.ms.System.n1.k5(var6)) {
               var6 = 100.0F;
            }

            if (var6 < 0.0F) {
               this.c8.l6(this.c8.k5() - var6);
            } else {
               float var7 = var4.getParagraphFormat().getDefaultPortionFormat().getFontHeight();
               IGenericEnumerator var8 = var4.getPortions().iterator();

               try {
                  while (var8.hasNext()) {
                     IPortion var9 = (IPortion)var8.next();
                     if (var9.getPortionFormat().getFontHeight() > var7) {
                        var7 = var9.getPortionFormat().getFontHeight();
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }

               if (!com.aspose.slides.ms.System.n1.k5(var7)) {
                  this.c8.l6(this.c8.k5() + var7 * var6 / 100.0F);
               }
            }
         } else {
            this.a6().getShapes().remove(this.s7);
            this.s7 = null;
         }
      }
   }

   private void n5(float var1, IParagraph[] var2) {
      this.c8.l6(var1 + this.s7.getHeight());
      ParagraphCollection var3 = (ParagraphCollection)this.s7.l6().getParagraphs();
      var2[0] = var3.get_Item(var3.getCount() - 1);
      if (!(this.c8.k5() <= this.h0.k5() - 12.0F)) {
         if (var3.getCount() > 1 && var2[0].getParagraphFormat().getBullet().getType() == 2) {
            f2z.n5(this.s7.getTextFrame());
         }

         ParagraphCollection var4 = new ParagraphCollection(this.s7.l6());

         while (var3.getCount() > 1 && this.c8.k5() > this.h0.k5() - 12.0F) {
            var3.remove(var2[0]);
            var4.insert(0, var2[0]);
            this.c8.l6(var1 + this.s7.getHeight());
            var2[0] = var3.get_Item(var3.getCount() - 1);
         }

         if (var4.getCount() > 0) {
            this.k5();
            this.u3();
            this.s7.getTextFrame().getParagraphs().add(var4);
            this.n5(12.0F, var2);
         }
      }
   }

   private void k5() {
      IBackground var1 = this.a6().getBackground();
      this.n5((Slide)this.a6.getSlides().insertEmptySlide(this.a6().z8() + 1, this.l6()));
      if (var1.getType() == 1) {
         ((FillFormat)this.a6().getBackground().getFillFormat()).n5(var1.getFillFormat());
         this.a6().getBackground().setType((byte)1);
      }

      this.n5().addItem(this.a6());
      this.c8 = new com.aspose.slides.internal.o9b.w1(12.0F, 12.0F);
   }

   private void l6(com.aspose.slides.internal.j3.z8 var1, boolean var2) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.w8.r4.class)) {
         this.l6.addItem(var1);
         if (var2) {
            com.aspose.slides.internal.w5.k5 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.w5.k5.class);
            if (var3 != null) {
               var3.m1(var3.a3().y8());
            }
         }

         IGenericEnumerator var8 = var1.y1().iterator();

         try {
            while (var8.hasNext()) {
               com.aspose.slides.internal.j3.z8 var4 = (com.aspose.slides.internal.j3.z8)var8.next();
               this.l6(var4, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }
      }
   }

   private void u3() {
      this.s7 = (AutoShape)this.a6().getShapes().addAutoShape(5, this.c8.l6(), this.c8.k5(), this.h0.l6() - 12.0F - 12.0F, 0.0F);
      this.s7.getShapeStyle().setFillStyleIndex((short)0);
      this.s7.getShapeStyle().setLineStyleIndex(0);
      this.s7.getShapeStyle().setFontCollectionIndex((byte)0);
      this.s7.getShapeStyle().getFontColor().setSchemeColor(1);
      if (this.x8 != null) {
         com.aspose.slides.internal.q0.n5 var1 = this.x8.a3().c8();
         if (var1 != null && !var1.n5().t2()) {
            this.s7.getFillFormat().setFillType((byte)1);
            ((ColorFormat)this.s7.getFillFormat().getSolidFillColor()).n5(var1.n5().o8());
         }
      }

      TextFrame var2 = (TextFrame)this.s7.addTextFrame("");
      var2.getTextFrameFormat().setAutofitType((byte)2);
      var2.getTextFrameFormat().setAnchoringType((byte)0);
      ((TextFrameFormat)var2.getTextFrameFormat()).n5(c0u.n5.l6());
      var2.getParagraphs().clear();
   }

   private IPPImage n5(String var1) {
      String var2 = this.k5.n5(this.u3, var1);
      if (var2 != null) {
         com.aspose.slides.internal.z0k.t4 var3 = this.k5.n5(var2);
         if (var3 != null) {
            return ((ImageCollection)this.a6.getImages()).n5(var3);
         }
      }

      return null;
   }

   private String l6(String var1) {
      if (this.t2 != null && ".".equals(this.t2.m1())) {
         return var1;
      }

      com.aspose.slides.ms.System.r8 var2 = null;
      com.aspose.slides.ms.System.r8[] var3 = new com.aspose.slides.ms.System.r8[]{var2};
      boolean var4 = com.aspose.slides.ms.System.r8.n5(var1, 0, var3);
      var2 = var3[0];
      if (var4) {
         if (var2.z3()) {
            return var1;
         }

         if (this.t2 != null) {
            if (this.t2.u9() != 2 && this.t2.u9() != 3 && this.t2.u9() != 4) {
               var2 = new com.aspose.slides.ms.System.r8(com.aspose.slides.internal.z0k.z1.l6(this.t2.x8(), var1), 0);
               if (var2.z3() && var2.c8()) {
                  return var2.x8();
               }

               return var2.toString();
            }

            var3[0] = var2;
            boolean var5 = com.aspose.slides.ms.System.r8.n5(this.t2, var3[0], var3);
            var2 = var3[0];
            if (var5) {
               return var2.toString();
            }
         }
      }

      var1 = !com.aspose.slides.ms.System.d1.n5(this.u3) ? com.aspose.slides.internal.z0k.z1.l6(this.u3, var1) : var1;
      return com.aspose.slides.ms.System.d1.n5(var1, "\\", "/");
   }

   private Slide a6() {
      return this.n3;
   }

   private void n5(Slide var1) {
      this.n3 = var1;
   }

   public final void n5(ISlide var1) {
      this.n5((Slide)var1);
      this.n5().addItem(this.a6());
      this.c8.l6(12.0F);
      List var2 = new List();
      IGenericEnumerator var3 = var1.getShapes().iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            if (v0q.n5(var4.getPlaceholder()) && !com.aspose.slides.ms.System.d1.n5(var4.getName())) {
               var2.addItem(var4.getName());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      com.aspose.slides.internal.o9b.y1 var15 = new com.aspose.slides.internal.o9b.y1();
      IGenericEnumerator var5 = var1.getShapes().iterator();

      try {
         while (var5.hasNext()) {
            IShape var6 = (IShape)var5.next();
            IPlaceholder var7 = var6.getPlaceholder();
            if ((var7 == null || var7.getType() <= 3 || var7.getType() >= 7) && !var2.containsItem(var6.getName())) {
               ((ShapeFrame)var6.getFrame()).n5().a6(var15);
               this.c8.l6(com.aspose.slides.ms.System.q1.n5((float)(this.c8.k5()), (float)(var15.l6() + 12.0F)));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   public final List<Slide> n5() {
      return this.n5;
   }

   public final LayoutSlide l6() {
      return this.u9;
   }
}
