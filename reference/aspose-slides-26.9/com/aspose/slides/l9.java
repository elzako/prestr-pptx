package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

final class l9 {
   private byte n5;
   private byte l6;
   private byte k5;
   private com.aspose.slides.ms.System.o5<Integer> u3 = new com.aspose.slides.ms.System.o5<>();
   private float a6;
   private short u9;
   private byte h0;
   private Picture c8;
   private boolean t2;
   private Portion s7;
   private Paragraph x8;
   private final ColorFormat n3;
   private final m5 y4;
   private final v5 e2;
   private v6v t9;
   private r0g z1;
   private IPresentationComponent t4;
   private ParagraphFormat q0;
   private long z3;

   l9(r0g var1, ColorFormat var2, Picture var3, m5 var4, v5 var5) {
      this.z1 = var1;
      this.n3 = var2;
      this.q0 = com.aspose.slides.internal.v6g.k5.n5(var1, ParagraphFormat.class);
      this.c8 = var3;
      this.y4 = var4;
      this.e2 = var5;
      this.l6 = -1;
      this.k5 = -1;
      this.a6 = Float.NaN;
      this.n5 = -1;
      this.u9 = -1;
      this.h0 = -1;
      this.t9 = s3p.n5(this.z1());
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      if (this.n5 != var1) {
         this.n5 = var1;
         this.z3();
      }
   }

   public final char l6() {
      return (char)this.y4().n5();
   }

   public final void n5(char var1) {
      if (this.y4().n5() != (short)var1) {
         this.y4().n5((short)var1);
         this.z3();
      }
   }

   public final String k5() {
      return this.y4().l6();
   }

   public final void n5(String var1) {
      if (!com.aspose.slides.ms.System.d1.a6(this.y4().l6(), var1)) {
         this.y4().n5(var1);
         this.z3();
      }
   }

   public final IFontData u3() {
      return !this.u3.l6() ? null : this.t9.n5(this.u3.n5() & 65535).l6();
   }

   public final void n5(IFontData var1) {
      if (var1 != null) {
         this.u3 = new com.aspose.slides.ms.System.o5<>(this.t9.n5(v6v.n5(var1.getFontName()), var1));
      } else {
         this.u3 = new com.aspose.slides.ms.System.o5<>();
      }

      this.z3();
   }

   public final float a6() {
      return this.a6;
   }

   public final void n5(float var1) {
      if (this.a6 != var1) {
         this.a6 = var1;
         this.z3();
      }
   }

   public final IColorFormat u9() {
      return this.n3;
   }

   public final short h0() {
      return this.u9;
   }

   public final void n5(short var1) {
      if (this.u9 != var1) {
         this.u9 = var1;
         this.z3();
      }
   }

   public final byte c8() {
      return this.h0;
   }

   public final void l6(byte var1) {
      if (this.h0 != var1) {
         this.h0 = var1;
         this.z3();
      }
   }

   public final byte t2() {
      return this.k5;
   }

   public final void k5(byte var1) {
      if (this.k5 != var1) {
         this.k5 = var1;
         this.z3();
      }
   }

   public final byte s7() {
      return this.l6;
   }

   public final void u3(byte var1) {
      if (this.l6 != var1) {
         this.l6 = var1;
         this.z3();
      }
   }

   public final void x8() {
      Paragraph var1 = com.aspose.slides.internal.v6g.k5.n5(this.q0.getParent_Immediate(), Paragraph.class);
      if (var1 == null) {
         throw new InvalidOperationException("Parent formatted object is not a paragraph.");
      }

      if (var1.x8() == null) {
         throw new InvalidOperationException("Paragraph wasn't added to any ITextFrame.Paragraphs collection (add it first).");
      }

      float var2 = this.n5(var1);
      if (var2 == 0.0F) {
         this.q0.setIndent(Float.NaN);
         this.q0.setMarginLeft(Float.NaN);
      } else {
         TextFrame var3 = var1.x8().k5();
         IParagraphFormat[] var4 = var3.u9();
         IParagraphFormat var5 = var4[var1.getParagraphFormat().getDepth() > 0 ? var1.getParagraphFormat().getDepth() : 0];
         if (var5.getBullet().getType() == -1) {
            this.q0.setIndent(-var2);
            this.q0.setMarginLeft(var5.getMarginLeft() + var2);
         } else if (this.n5(var5.getBullet().getType(), this.q0.getBullet().getType())) {
            this.q0.setIndent(Float.NaN);
            this.q0.setMarginLeft(Float.NaN);
         } else if (var5.getIndent() <= 0.0F) {
            this.q0.setIndent(-var2);
            this.q0.setMarginLeft(var5.getMarginLeft() + var5.getIndent() + var2);
         } else {
            this.q0.setIndent(-var2);
            this.q0.setMarginLeft(var5.getMarginLeft() + var2);
         }
      }
   }

   final m5 n3() {
      return this.y4;
   }

   final v5 y4() {
      return this.e2;
   }

   public final boolean e2() {
      return this.n5() != 0 && this.n5() != -1;
   }

   final boolean t9() {
      return this.y4().n5() != -1;
   }

   public final IPresentationComponent z1() {
      if (this.t4 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.t4};
         d0u.n5(IPresentationComponent.class, this.z1, var1);
         this.t4 = var1[0];
      }

      return this.t4;
   }

   final void n5(BulletFormat var1) {
      this.k5 = var1.isBulletHardColor();
      this.l6 = var1.isBulletHardFont();
      this.y4().n5(var1.h0().n5());
      this.y4().n5(var1.h0().l6());
      this.n3.n5((ColorFormat)var1.getColor());
      this.n5((FontData)var1.getFont());
      this.a6 = var1.getHeight();
      this.c8.n5((Picture)var1.getPicture());
      this.n5 = var1.getType();
      this.u9 = var1.getNumberedBulletStartWith();
      this.h0 = var1.getNumberedBulletStyle();
      this.z3();
   }

   final void l6(BulletFormat var1) {
      if (var1.getType() != -1) {
         this.n5 = var1.getType();
      }

      if (var1.getFont() != null) {
         this.n5(var1.getFont());
      }

      if (!((ColorFormat)var1.getColor()).n3()) {
         this.n3.n5((ColorFormat)var1.getColor());
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getHeight(), Float.NaN)) {
         this.a6 = var1.getHeight();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.isBulletHardColor(), -1.0F)) {
         this.k5 = var1.isBulletHardColor();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.isBulletHardFont(), -1.0F)) {
         this.l6 = var1.isBulletHardFont();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getNumberedBulletStartWith(), -1.0F)) {
         this.u9 = var1.getNumberedBulletStartWith();
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.getNumberedBulletStyle(), -1.0F)) {
         this.h0 = var1.getNumberedBulletStyle();
      }

      this.c8.n5((Picture)var1.getPicture());
      if (!com.aspose.slides.internal.n8e.v4.n5(var1.h0().n5(), -1.0F)) {
         this.y4().n5(var1.h0().n5());
      }

      if (!com.aspose.slides.internal.n8e.v4.n5(var1.h0().l6(), com.aspose.slides.ms.System.d1.n5)) {
         this.y4().n5(var1.h0().l6());
      }

      this.z3();
   }

   final void n5(g9 var1) {
      if (var1.getFillFormat().getFillType() == 1) {
         this.n3.l6(((f6a)var1.getFillFormat()).h0().o8());
      }

      if (var1.getFillFormat().getFillType() == 4) {
         this.c8.n5(var1.getFillFormat().getPictureFillFormat().getPicture());
      }

      this.k5 = (byte)(var1.isBulletHardColor() ? 1 : 0);
      this.l6 = (byte)(var1.isBulletHardFont() ? 1 : 0);
      this.y4().n5((short)var1.getChar());
      this.y4().n5(var1.l6());
      this.n5((FontData)var1.getFont());
      this.a6 = var1.h0;
      this.n5 = var1.k5;
      this.u9 = var1.getNumberedBulletStartWith();
      this.h0 = var1.getNumberedBulletStyle();
      this.z3();
   }

   final boolean n5(IBulletFormat var1) {
      return this.n5 == var1.getType()
         && this.l6 == var1.isBulletHardFont()
         && this.k5 == var1.isBulletHardColor()
         && this.y4().n5() == ((BulletFormat)var1).h0().n5()
         && com.aspose.slides.ms.System.d1.a6(this.y4().l6(), ((BulletFormat)var1).h0().l6())
         && (this.u3() != null && this.u3().equals(var1.getFont()) || this.u3() == null && var1.getFont() == null)
         && com.aspose.slides.internal.n8e.v4.n5(this.a6, var1.getHeight())
         && (this.n3 != null && this.n3.equals(var1.getColor()) || this.n3 == null && var1.getColor() == null)
         && this.u9 == var1.getNumberedBulletStartWith()
         && this.h0 == var1.getNumberedBulletStyle();
   }

   final void l6(IBulletFormat var1) {
      if (this.n5 != -1) {
         var1.setType(this.n5);
      }

      if (this.l6 != -1) {
         var1.setBulletHardFont(this.l6);
      }

      if (this.k5 != -1) {
         var1.setBulletHardColor(this.k5);
      }

      if (this.y4().n5() != -1) {
         ((BulletFormat)var1).h0().n5(this.y4().n5());
      }

      if (com.aspose.slides.ms.System.d1.n5(this.y4().l6())) {
         ((BulletFormat)var1).h0().n5(this.y4().l6());
      }

      if (this.u3() != null) {
         var1.setFont(this.u3());
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.a6)) {
         var1.setHeight(this.a6);
      }

      if (this.n3.getColorType() != -1) {
         ((ColorFormat)var1.getColor()).n5(this.n3);
      }

      if (this.u9 != -1) {
         var1.setNumberedBulletStartWith(this.u9);
      }

      if (this.h0 != -1) {
         var1.setNumberedBulletStyle(this.h0);
      }

      if (this.c8.getImage() != null) {
         ((BulletFormat)var1).c8().n5(this.c8);
      }
   }

   final void k5(IBulletFormat var1) {
      if (this.n5 == -1) {
         this.n5 = var1.getType();
      }

      if (this.l6 == -1) {
         this.l6 = var1.isBulletHardFont();
      }

      if (this.k5 == -1) {
         this.k5 = var1.isBulletHardColor();
      }

      String var2 = this.y4().l6();
      if (this.y4().n5() == -1) {
         this.y4().n5(((BulletFormat)var1).h0().n5());
      }

      if (com.aspose.slides.ms.System.d1.n5(var2)) {
         this.y4().n5(((BulletFormat)var1).h0().l6());
      }

      if (this.u3() == null) {
         this.n5((FontData)var1.getFont());
      }

      if (com.aspose.slides.ms.System.n1.k5(this.a6)) {
         this.a6 = var1.getHeight();
      }

      if (this.n3.getColorType() == -1) {
         this.n3.n5((ColorFormat)var1.getColor());
      }

      if (this.u9 == -1) {
         this.u9 = var1.getNumberedBulletStartWith();
      }

      if (this.h0 == -1) {
         this.h0 = var1.getNumberedBulletStyle();
      }

      if (this.c8.getImage() == null) {
         this.c8.n5((Picture)((BulletFormat)var1).getPicture());
      }
   }

   final Portion t4() {
      if (!this.t2 || this.s7 != null && (this.s7.n3() == null || !this.s7.n3().equals(this.x8))) {
         Paragraph[] var1 = new Paragraph[]{this.x8};
         boolean var2 = d0u.n5(Paragraph.class, this.z1, var1) && var1[0].getPortions().getCount() > 0;
         this.x8 = var1[0];
         if (var2) {
            this.s7 = (Portion)this.x8.getPortions().get_Item(0);
         }

         this.t2 = true;
      }

      return this.s7;
   }

   public final long q0() {
      return (((this.z3 & 4294967295L) + (this.n3.getVersion() & 4294967295L) & 4294967295L) + (this.c8.getVersion() & 4294967295L) & 4294967295L)
            + (
               (
                     this.t4() != null
                        ? (this.t4().l6().getVersion() & 4294967295L)
                              + ((this.t4() != null && this.t4().n3() != null ? this.t4().n3().n5().u3().getVersion() : 0L) & 4294967295L)
                           & 4294967295L
                        : 0L
                  )
                  & 4294967295L
            )
         & 4294967295L;
   }

   private void z3() {
      this.z3++;
   }

   private boolean n5(byte var1, byte var2) {
      return var1 == 2 && var2 == 2 ? true : (var1 == 1 || var1 == 3) && (var2 == 1 || var2 == 3);
   }

   private float n5(Paragraph var1) {
      if (this.n5() != 0 && this.n5() != -1) {
         double var2;
         if (var1.getPortions().getCount() > 0) {
            var2 = ((Portion)var1.getPortions().get_Item(0)).l6().r4().h0();
         } else {
            var2 = ((c9g)var1.getParagraphFormat().getEffective().getDefaultPortionFormat()).h0();
         }

         double var4 = 0.0;
         if (this.n5() == 2) {
            var4 = this.n5(var2);
         } else if (this.n5() == 1 || this.n5() == 3) {
            var4 = this.l6(var2);
         }

         return (float)(var4 * 360000.0 / 12700.0);
      } else {
         return 0.0F;
      }
   }

   private double n5(double var1) {
      if (this.c8() == -1) {
         return 0.0;
      }

      double var3 = 0.0;
      if (this.c8() != 3 && this.c8() != 2 && this.c8() != 1 && this.c8() != 9 && this.c8() != 0) {
         if (this.c8() != 7 && this.c8() != 6) {
            if (this.c8() != 12 && this.c8() != 13 && this.c8() != 8 && this.c8() != 10 && this.c8() != 11) {
               if (var1 <= 12.0) {
                  var3 = 0.79;
               } else if (var1 > 12.0 && var1 <= 18.0) {
                  var3 = 1.11;
               } else if (var1 > 18.0 && var1 <= 25.0) {
                  var3 = 1.43;
               } else if (var1 > 25.0 && var1 <= 35.0) {
                  var3 = 1.59;
               } else if (var1 > 35.0 && var1 <= 44.0) {
                  var3 = 2.38;
               } else if (var1 > 44.0 && var1 <= 56.0) {
                  var3 = 2.86;
               } else if (var1 > 56.0 && var1 <= 72.0) {
                  var3 = 3.18;
               } else if (var1 > 72.0) {
                  var3 = 3.81;
               }
            } else if (var1 <= 12.0) {
               var3 = 0.64;
            } else if (var1 > 12.0 && var1 <= 18.0) {
               var3 = 0.95;
            } else if (var1 > 18.0 && var1 <= 25.0) {
               var3 = 1.27;
            } else if (var1 > 25.0 && var1 <= 35.0) {
               var3 = 1.43;
            } else if (var1 > 35.0 && var1 <= 44.0) {
               var3 = 2.06;
            } else if (var1 > 44.0 && var1 <= 56.0) {
               var3 = 2.54;
            } else if (var1 > 56.0 && var1 <= 72.0) {
               var3 = 3.18;
            } else if (var1 > 72.0) {
               var3 = 3.81;
            }
         } else if (var1 <= 12.0) {
            var3 = 0.79;
         } else if (var1 > 12.0 && var1 <= 18.0) {
            var3 = 1.11;
         } else if (var1 > 18.0 && var1 <= 25.0) {
            var3 = 1.43;
         } else if (var1 > 25.0 && var1 <= 35.0) {
            var3 = 1.59;
         } else if (var1 > 35.0 && var1 <= 44.0) {
            var3 = 2.38;
         } else if (var1 > 44.0 && var1 <= 56.0) {
            var3 = 2.86;
         } else if (var1 > 56.0 && var1 <= 72.0) {
            var3 = 3.18;
         } else if (var1 > 72.0) {
            var3 = 3.81;
         }
      } else if (var1 <= 12.0) {
         var3 = 0.64;
      } else if (var1 > 12.0 && var1 <= 18.0) {
         var3 = 0.95;
      } else if (var1 > 18.0 && var1 <= 25.0) {
         var3 = 1.27;
      } else if (var1 > 25.0 && var1 <= 35.0) {
         var3 = 1.43;
      } else if (var1 > 35.0 && var1 <= 44.0) {
         var3 = 2.06;
      } else if (var1 > 44.0 && var1 <= 56.0) {
         var3 = 2.54;
      } else if (var1 > 56.0 && var1 <= 72.0) {
         var3 = 3.18;
      } else if (var1 > 72.0) {
         var3 = 3.81;
      }

      return var3;
   }

   private double l6(double var1) {
      com.aspose.slides.internal.f8y.n5.n5(this.n5() == 1 || this.n5() == 3);
      double var3 = 0.0;
      if (var1 <= 12.0) {
         var3 = 0.48;
      } else if (var1 > 12.0 && var1 <= 18.0) {
         var3 = 0.79;
      } else if (var1 > 18.0 && var1 <= 25.0) {
         var3 = 0.95;
      } else if (var1 > 25.0 && var1 <= 35.0) {
         var3 = 1.27;
      } else if (var1 > 35.0 && var1 <= 44.0) {
         var3 = 1.59;
      } else if (var1 > 44.0 && var1 <= 56.0) {
         var3 = 1.91;
      } else if (var1 > 56.0 && var1 <= 72.0) {
         var3 = 2.38;
      } else if (var1 > 72.0) {
         var3 = 3.18;
      }

      return var3;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(new String[]{"BulletFormat: ", com.aspose.slides.ms.System.s3.n5(BulletType.class, this.n5)});
   }

   @Override
   public boolean equals(Object obj) {
      BulletFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, BulletFormat.class);
      if (var2 == null) {
         return false;
      } else if (com.aspose.slides.ms.System.o5.l6(this.n3().n5(), var2.u9().n5()) || this.y4().n5() != var2.h0().n5()) {
         return false;
      } else {
         return com.aspose.slides.ms.System.o5.l6(this.n3().n5(), var2.u9().n5()) || !com.aspose.slides.ms.System.d1.a6(this.y4().l6(), var2.h0().l6())
            ? false
            : com.aspose.slides.internal.n8e.v4.n5((float)(this.n5()), (float)(var2.getType()))
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.t2()), (float)(var2.isBulletHardColor()))
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.s7()), (float)(var2.isBulletHardFont()))
               && com.aspose.slides.internal.n8e.v4.n5(this.a6(), var2.getHeight())
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.h0()), (float)(var2.getNumberedBulletStartWith()))
               && com.aspose.slides.internal.n8e.v4.n5((float)(this.c8()), (float)(var2.getNumberedBulletStyle()))
               && com.aspose.slides.internal.n8e.v4.n5(this.u3(), var2.getFont())
               && com.aspose.slides.internal.n8e.v4.n5(this.u9(), var2.getColor());
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
