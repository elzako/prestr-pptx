package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class n6s extends k1z {
   private y2q t2;
   private List<f0o> s7 = new List<>();
   private com.aspose.slides.internal.k0r.e4 x8;

   n6s(y2q var1) {
      this(var1.l6().k5, null);
      this.t2 = var1;
   }

   n6s(GroupShape var1, n6s var2) {
      this(var2);
      this.n5 = var1;
      if (this.a6() != null) {
         this.a6().l6(this);
      }

      this.z1();
   }

   n6s(n6s var1) {
      super(var1);
   }

   final void n5(GroupShape var1) {
      ShapeCollection var2 = var1.n5;
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            this.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   final void n5(IShape var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, IChart.class)) {
         PictureFrame var9 = n5(var1, false);
         new k1z(var9, this);
      } else if (!com.aspose.slides.internal.v6g.k5.l6(var1, Ink.class) && !com.aspose.slides.internal.v6g.k5.l6(var1, InkActions.class)) {
         AutoShape var8 = com.aspose.slides.internal.v6g.k5.n5(var1, AutoShape.class);
         if (var8 != null && var8.l6() != null && var8.l6().s7().z1() == 1) {
            ThreeDFormat var3 = (ThreeDFormat)var8.l6().getTextFrameFormat().getThreeDFormat();
            if (var3.a6()) {
               PictureFrame var11 = n5(var1, false);
               new k1z(var11, var8, this);
               return;
            }
         }

         Table var10 = com.aspose.slides.internal.v6g.k5.n5(var1, Table.class);
         if (var10 != null) {
            new n7r(var10, this);
         } else {
            LegacyDiagram var4 = com.aspose.slides.internal.v6g.k5.n5(var1, LegacyDiagram.class);
            if (var4 != null) {
               s6o var12 = new s6o(var4, this);
               var12.n5(var4.k5());
            } else {
               GroupShape var5 = com.aspose.slides.internal.v6g.k5.n5(var1, GroupShape.class);
               if (var5 != null) {
                  n6s var13 = new n6s(var5, this);
                  var13.n5(var5);
               } else {
                  Shape var6 = com.aspose.slides.internal.v6g.k5.n5(var1, Shape.class);
                  if (var6 != null) {
                     new k1z(var6, this);
                  } else {
                     throw new ArgumentNullException("Unknown shapes in ShapesGroup!");
                  }
               }
            }
         }
      } else {
         PictureFrame var2 = n5(var1, true);
         new k1z(var2, this);
      }
   }

   static PictureFrame n5(IShape var0, boolean var1) {
      com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(var0.getX(), var0.getY(), var0.getWidth(), var0.getHeight());
      if (!var0.getHidden() && var1) {
         ((Shape)var0).e5().x8().a6(var2);
      }

      String var3 = w6n.n5((Shape)var0, var2.y4());
      SvgImage var4 = new SvgImage(var3);
      IPPImage var5 = var0.getPresentation().getImages().addImage(var4);
      PictureFrame var6 = new PictureFrame((r0g)var0.getParentGroup());
      var6.getPictureFormat().setPictureFillMode(1);
      var6.e2().l6(5);
      var6.setFrame(new ShapeFrame(var2.x8(), var2.n3(), var2.s7(), var2.k5(), (byte)0, (byte)0, 0.0F));
      if (var0.getHyperlinkClick() != null && var0.getHyperlinkClick().getActionType() != 0) {
         var6.setHyperlinkClick(var0.getHyperlinkClick());
      }

      var6.getPictureFormat().getPicture().setImage(var5);
      return var6;
   }

   final void t2() {
      if (this.x8 == null) {
         if (this.y4()) {
            this.x8 = this.a6().a6().u3();
            this.h0 = true;
         } else {
            this.x8 = new com.aspose.slides.internal.k0r.e4();
            this.x8.l6(true);
         }
      }
   }

   @Override
   void n5() {
      this.t2();
      this.l6 = new com.aspose.slides.internal.k0r.q5();
      this.l6.l6(true);
      this.x8.e2().addItem(this.l6);
      com.aspose.slides.internal.k0r.q9 var1 = this.z3().l6();
      com.aspose.slides.internal.k0r.p1 var2 = this.z3().u3();
      var2.k5(this.y4());
      var2.n5(true);
   }

   @Override
   void c8() {
      this.t4();
      if (!this.h0) {
         this.k5.x8().e2().addItem(this.x8);
         this.h0 = true;
      }
   }

   @Override
   y2q k5() {
      return this.k5 != null ? this.k5.a6() : this.t2;
   }

   @Override
   Shape s7() {
      return (GroupShape)this.n5;
   }

   final com.aspose.slides.internal.k0r.e4 x8() {
      if (this.x8 == null) {
         this.n5();
      }

      return this.x8;
   }

   final List<f0o> n3() {
      return this.s7;
   }

   final boolean y4() {
      return this.t2 != null;
   }
}
