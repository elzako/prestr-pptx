package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

final class g9 extends x8<BulletFormat, g9> implements IBulletFormatEffectiveData, i6m {
   byte k5;
   short u3;
   String a6;
   FontData u9;
   private FontData e2;
   float h0 = Float.NaN;
   short c8;
   byte t2;
   final j3z s7;
   m4a x8;
   private f6a t9;
   boolean n3;
   boolean y4;
   private static final g9 z1 = u9();
   private int t4 = 0;
   private String q0 = null;
   private t3x z3;

   g9() {
      super((BulletFormat)null);
      this.s7 = new j3z();
      this.s7.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      this.x8 = new m4a();
      this.k5 = 0;
      this.u3 = 8226;
      this.a6 = com.aspose.slides.ms.System.d1.n5('•', 1);
      this.u9 = v6v.n5;
      this.h0 = 100.0F;
      this.c8 = 1;
      this.t2 = 3;
      this.n3 = false;
      this.y4 = false;
      this.t9 = f6a.e2();
   }

   g9(BulletFormat var1) {
      this(var1, false);
   }

   g9(BulletFormat var1, boolean var2) {
      super(var1);
      this.s7 = new j3z();
      this.l6(var2);
   }

   g9(BulletFormat var1, g9 var2) {
      super(var1);
      this.s7 = new j3z();
      this.l6(false);
      this.n5((i7b)var2);
   }

   g9(t3x var1) {
      super(var1);
      this.s7 = new j3z();
      this.l6(false);
      this.z3 = var1;
   }

   g9(t3x var1, g9 var2) {
      super(var1);
      this.s7 = new j3z();
      this.l6(false);
      this.z3 = var1;
      this.n5((i7b)var2);
   }

   private void l6(boolean var1) {
      this.x8 = new m4a();
      this.t9 = new f6a(this);
      if (!var1) {
         this.t9.n5((i7b)((f6a)z1.getFillFormat()));
         if (this.t9.getFillType() == 4) {
            this.t9.n3().n5((i7b)((f3f)z1.getFillFormat().getPictureFillFormat()));
         }
      }
   }

   @Override
   public final byte getType() {
      return this.k5;
   }

   @Override
   public final char getChar() {
      return (char)this.u3;
   }

   @Override
   public final String l6() {
      return this.a6;
   }

   @Override
   public final String getActualBulletValue() {
      if (this.k5 != 3 && this.q0 == null) {
         this.q0 = this.h0();
      }

      return this.q0;
   }

   @Override
   public final IFontData getFont() {
      return this.e2;
   }

   @Override
   public final float getHeight() {
      return this.h0;
   }

   @Override
   public final short getNumberedBulletStartWith() {
      return this.c8;
   }

   @Override
   public final byte getNumberedBulletStyle() {
      return this.t2;
   }

   @Override
   public final IPictureEffectiveData getPicture() {
      return this.x8;
   }

   @Override
   public final IFillFormatEffectiveData getFillFormat() {
      return this.t9;
   }

   @Override
   public final boolean isBulletHardColor() {
      return this.n3;
   }

   @Override
   public final boolean isBulletHardFont() {
      return this.y4;
   }

   @Override
   public final boolean n5() {
      return this.getType() != 0;
   }

   static g9 n5(BulletFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (var1 == null) {
         return z1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Paragraph.class)) {
         Paragraph var5 = (Paragraph)var1;
         TextFrame var3 = var5.x8().k5();
         TextStyle var4 = (TextStyle)var3.getTextFrameFormat().getTextStyle();
         return (g9)var4.getEffective().getLevel(var5.getParagraphFormat().getDepth() > 0 ? var5.getParagraphFormat().getDepth() : 0).getBullet();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, Field.class)) {
         Field var2 = (Field)var1;
         return (g9)var2.k5().n3().n5().t9().getBullet();
      } else {
         throw new NotImplementedException();
      }
   }

   static g9 u9() {
      return new g9();
   }

   final void n5(i7b var1) {
      g9 var2 = (g9)var1;
      this.k5 = var2.k5;
      this.u3 = var2.u3;
      this.a6 = var2.a6;
      this.u9 = var2.u9;
      this.h0 = var2.h0;
      this.c8 = var2.c8;
      this.t2 = var2.t2;
      this.s7.n5(var2.s7);
      this.x8.n5((i7b)var2.x8);
      this.n3 = var2.n3;
      this.y4 = var2.y4;
      this.t9.n5((i7b)var2.t9);
   }

   void n5(i7b var1, BulletFormat var2) {
      this.n5(var1);
      this.l6(var2);
      this.k5(var2);
   }

   final void l6(BulletFormat var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1.getParent_IPresentationComponent(), MasterSlide.class) && !var1.s7()) {
         this.k5 = 0;
      }

      if (var1.getType() != -1) {
         this.k5 = var1.getType();
      }

      if (var1.h0().n5() != -1) {
         this.u3 = var1.h0().n5();
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1.h0().l6())) {
         this.a6 = var1.h0().l6();
      }

      if (var1.getFont() != null) {
         this.u9 = (FontData)var1.getFont();
      }

      if (!com.aspose.slides.ms.System.n1.k5(var1.getHeight())) {
         this.h0 = var1.getHeight();
      }

      if (var1.getNumberedBulletStartWith() != -1) {
         this.c8 = var1.getNumberedBulletStartWith();
      }

      if (var1.getNumberedBulletStyle() != -1) {
         this.t2 = var1.getNumberedBulletStyle();
      }

      if (var1.getColor().getColorType() != -1) {
         this.s7.n5((ColorFormat)var1.getColor());
      }

      if (var1.getPicture().getImage() != null) {
         this.x8.n5(var1.c8());
      }

      if (var1.isBulletHardColor() != -1) {
         this.n3 = var1.isBulletHardColor() == 1;
      }

      if (var1.isBulletHardFont() != -1) {
         this.y4 = var1.isBulletHardFont() == 1;
      }

      this.q0 = null;
   }

   final void k5(BulletFormat var1) {
      if (this.t4 < 2) {
         try {
            this.t4++;
            if (this.k5 != 3 && !this.n3 && var1.x8() != null) {
               f6a var2 = ((FillFormat)var1.x8().getPortionFormat().getFillFormat()).c8();
               this.t9.u9();
               this.t9.n5((i7b)var2);
               if (var2.getFillType() != 1) {
                  this.t9.t2().n5(new ColorFormat(var1.x8(), com.aspose.slides.internal.o9b.c8.m3().o8()));
               }

               if (var2.getFillType() == 0) {
                  this.t9.k5 = 1;
               }

               if (var2.getFillType() == 1) {
                  this.s7.n5(var2.t2());
               } else if (var2.getFillType() == 0) {
                  this.s7.n5(new ColorFormat(var1.x8(), com.aspose.slides.internal.o9b.c8.m3().o8()));
               } else {
                  this.s7.n5(new ColorFormat(var1.x8(), com.aspose.slides.internal.o9b.c8.u3.o8()));
               }
            } else if (this.k5 == 3 && this.x8.getImage() != null) {
               this.t9.u9();
               this.t9.k5 = 4;
               this.t9.n3().t2().n5((i7b)this.x8);
            } else {
               this.t9.u9();
               this.t9.k5 = 1;
               this.t9.t2().n5(this.s7);
            }
         } finally {
            this.t4--;
         }
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      w6a var3 = this.n3 ? new w6a(null, null) : var2;
      this.s7.n5(var1, var3);
      this.x8.n5(var1, var2);
      this.t9.n5(var1, var3);
      if (this.t9.getFillType() != 1) {
         this.t9.t2().n5(var1, var3);
      }
   }

   @Override
   void n5(IBaseSlide var1) {
      if (var1 != null && this.u9 != null) {
         IThemeEffectiveData var2 = var1.createThemeEffective();
         this.e2 = this.u9.n5(var2);
      } else {
         this.e2 = FontData.a6();
      }
   }

   boolean n5(g9 var1) {
      return var1 == null
         ? false
         : this.k5 == var1.k5
            && this.u3 == var1.u3
            && com.aspose.slides.ms.System.d1.a6(this.a6, var1.a6)
            && (this.e2 != null ? this.e2.n5(var1.e2, true) : var1.e2 == null)
            && com.aspose.slides.internal.n8e.v4.n5(this.h0, var1.h0)
            && this.c8 == var1.c8
            && this.t2 == var1.t2
            && this.s7.l6(var1.s7)
            && this.x8.n5(var1.x8)
            && this.n3 == var1.n3
            && this.y4 == var1.y4
            && this.t9.equals(var1.getFillFormat());
   }

   static g9 n5(BulletFormat var0, g9 var1) {
      return var1 != null ? new g9(var0, var1) : new g9(var0);
   }

   private String h0() {
      String var1 = "";
      ParagraphFormat var2 = this.z3.W_();
      Paragraph var3 = com.aspose.slides.internal.v6g.k5.n5(var2.getParent_IPresentationComponent(), Paragraph.class);
      TextFrame var4 = null;
      TextFrame[] var5 = new TextFrame[]{var4};
      boolean var6 = var3 != null && d0u.n5(TextFrame.class, var2, var5);
      var4 = var5[0];
      if (var6) {
         int var7 = var3.h0();
         if (var7 != -1) {
            e2n[] var8 = e2n.n5(var4, 0);
            var1 = var8[var7].a6();
         }
      }

      return var1;
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.g9)recoveredArg);
   }
}
