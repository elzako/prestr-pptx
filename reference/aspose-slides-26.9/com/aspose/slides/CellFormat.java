package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public final class CellFormat extends PVIObject implements ICellFormat {
   static final com.aspose.slides.internal.f3.a6<CellFormat, f1s, f1s> n5 = new CellFormat$5();
   private FillFormat l6;
   private LineFormat k5;
   private LineFormat u3;
   private LineFormat a6;
   private LineFormat u9;
   private LineFormat h0;
   private LineFormat c8;
   private Cell t2;
   private f1s s7;

   CellFormat(r0g parentImmediate) {
      super(parentImmediate);
      this.t2 = (Cell)parentImmediate;
   }

   @Override
   void N_() {
      this.l6 = new FillFormat(this);
      this.k5 = new LineFormat(this);
      this.u3 = new LineFormat(this);
      this.a6 = new LineFormat(this);
      this.u9 = new LineFormat(this);
      this.h0 = new LineFormat(this);
      this.c8 = new LineFormat(this);
      this.k5.n5.l6(new CellFormat$1(this));
      this.u3.n5.l6(new CellFormat$6(this));
      this.a6.n5.l6(new CellFormat$7(this));
      this.u9.n5.l6(new CellFormat$8(this));
   }

   @Override
   Object M_() {
      return new k0t(this.getParent_Immediate(), this.l6, this.k5, this.u3, this.a6, this.u9, this.h0, this.c8);
   }

   final k0t l6() {
      return (k0t)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().n5();
   }

   @Override
   public final IFillFormat getFillFormat() {
      this.m3();
      return this.l6;
   }

   @Override
   public final ILineFormat getBorderLeft() {
      this.m3();
      return this.k5;
   }

   @Override
   public final ILineFormat getBorderTop() {
      this.m3();
      return this.u3;
   }

   @Override
   public final ILineFormat getBorderRight() {
      this.m3();
      return this.a6;
   }

   @Override
   public final ILineFormat getBorderBottom() {
      this.m3();
      return this.u9;
   }

   @Override
   public final ILineFormat getBorderDiagonalDown() {
      this.m3();
      return this.h0;
   }

   @Override
   public final ILineFormat getBorderDiagonalUp() {
      this.m3();
      return this.c8;
   }

   @Override
   public final ICellFormatEffectiveData getEffective() {
      return this.u9();
   }

   @Override
   public final float getTransparency() {
      this.c8();
      return this.s7();
   }

   @Override
   public final void setTransparency(float value) {
      if (!(value < 0.0F) && !(value > 1.0F)) {
         this.c8();
         this.n5(value);
      } else {
         throw new ArgumentException("Value should be defined in the range [0..1].");
      }
   }

   final void n5(LineFormat var1) {
      if (!this.t2.c8()) {
         if (var1.getFillFormat().getFillType() != 0 && var1.getFillFormat().getFillType() != -1) {
            if (var1 == this.k5) {
               if (this.t2.getFirstColumnIndex() < 1) {
                  return;
               }

               for (int var2 = 0; var2 < this.t2.getRowSpan(); var2++) {
                  if (var2 > 0) {
                     this.t2.k5().n5(this.t2.u3().h0(), this.t2.u9().h0() + var2).getCellFormat().getBorderLeft().getFillFormat().setFillType((byte)-1);
                  }

                  Cell var3 = this.t2.k5().n5(this.t2.u3().h0() - 1, this.t2.u9().h0() + var2);
                  if (var3 != null) {
                     if (var3.a6().u9().h0() == this.t2.u9().h0() + var2) {
                        ((LineFormat)var3.a6().getCellFormat().getBorderRight()).l6((ILineFormat)var1);
                     } else {
                        ((LineFormat)var3.getCellFormat().getBorderRight()).l6((ILineFormat)var1);
                     }
                  }
               }
            }

            if (var1 == this.u3) {
               if (this.t2.getFirstRowIndex() < 1) {
                  return;
               }

               for (int var4 = 0; var4 < this.t2.getColSpan(); var4++) {
                  if (var4 > 0) {
                     this.t2.k5().n5(this.t2.u3().h0() + var4, this.t2.u9().h0()).getCellFormat().getBorderTop().getFillFormat().setFillType((byte)-1);
                  }

                  Cell var7 = this.t2.k5().n5(this.t2.u3().h0() + var4, this.t2.u9().h0() - 1);
                  if (var7 != null) {
                     if (var7.a6().u3().h0() == this.t2.u3().h0() + var4) {
                        ((LineFormat)var7.a6().getCellFormat().getBorderBottom()).l6((ILineFormat)var1);
                     } else {
                        ((LineFormat)var7.getCellFormat().getBorderBottom()).l6((ILineFormat)var1);
                     }
                  }
               }
            }

            if (var1 == this.a6) {
               if (this.t2.getFirstColumnIndex() >= this.t2.k5().getColumns().size() - 1) {
                  return;
               }

               for (int var5 = 0; var5 < this.t2.getRowSpan(); var5++) {
                  if (this.t2.getColSpan() > 1) {
                     this.t2
                        .k5()
                        .n5(this.t2.u3().h0() + this.t2.getColSpan() - 1, this.t2.u9().h0() + var5)
                        .getCellFormat()
                        .getBorderRight()
                        .getFillFormat()
                        .setFillType((byte)-1);
                  }

                  if (this.t2.u3().h0() + this.t2.getColSpan() < this.t2.k5().getColumns().size()) {
                     Cell var8 = this.t2.k5().n5(this.t2.u3().h0() + this.t2.getColSpan(), this.t2.u9().h0() + var5);
                     if (var8 != null) {
                        ((LineFormat)var8.getCellFormat().getBorderLeft()).l6((ILineFormat)var1);
                     }
                  }
               }
            }

            if (var1 == this.u9) {
               if (this.t2.getFirstRowIndex() >= this.t2.k5().getRows().size() - 1) {
                  return;
               }

               for (int var6 = 0; var6 < this.t2.getColSpan(); var6++) {
                  if (this.t2.getRowSpan() > 1) {
                     this.t2
                        .k5()
                        .n5(this.t2.u3().h0() + var6, this.t2.u9().h0() + this.t2.getRowSpan() - 1)
                        .getCellFormat()
                        .getBorderBottom()
                        .getFillFormat()
                        .setFillType((byte)-1);
                  }

                  if (this.t2.u9().h0() + this.t2.getRowSpan() < this.t2.k5().getRows().size()) {
                     Cell var9 = this.t2.k5().n5(this.t2.u3().h0() + var6, this.t2.u9().h0() + this.t2.getRowSpan());
                     if (var9 != null) {
                        ((LineFormat)var9.getCellFormat().getBorderTop()).l6((ILineFormat)var1);
                     }
                  }
               }
            }
         }
      }
   }

   final void u3() {
      this.m3();
      this.k5.n5.n5(new CellFormat$9(this));
      this.u3.n5.n5(new CellFormat$10(this));
      this.a6.n5.n5(new CellFormat$11(this));
      this.u9.n5.n5(new CellFormat$12(this));
   }

   final void a6() {
      this.m3();
      this.k5.n5.l6(new CellFormat$13(this));
      this.u3.n5.l6(new CellFormat$2(this));
      this.a6.n5.l6(new CellFormat$3(this));
      this.u9.n5.l6(new CellFormat$4(this));
   }

   final f1s u9() {
      f1s[] var1 = new f1s[]{this.s7};
      f1s var2 = f1s.n5(f1s.class, var1, this, n5);
      this.s7 = var1[0];
      if (this.s7 != null) {
         this.s7.n5(f1s.class);
      }

      return var2;
   }

   final void n5(ICellFormatEffectiveData var1) {
      this.k7();
      this.l6.n5(var1.getFillFormat());
      this.k5.n5(var1.getBorderLeft());
      this.u3.n5(var1.getBorderTop());
      this.a6.n5(var1.getBorderRight());
      this.u9.n5(var1.getBorderBottom());
      this.h0.n5(var1.getBorderDiagonalDown());
      this.c8.n5(var1.getBorderDiagonalUp());
   }

   final boolean h0() {
      return this.getFillFormat().getFillType() == 1 || this.getFillFormat().getFillType() == -1 && this.t2.n3().n5().l6().getFillType() == 1;
   }

   private void c8() {
      if (!this.h0()) {
         throw new InvalidOperationException("Transparency can only be set or retrieved when FillType is Solid.");
      }
   }

   private void n5(float var1) {
      float var2 = 1.0F - var1;
      this.t2();
      if (var1 != 0.0F) {
         if (this.getFillFormat().getFillType() == -1) {
            ((FillFormat)this.getFillFormat()).n5(this.t2.n3().n5().l6());
         }

         this.getFillFormat().getSolidFillColor().getColorTransform().add(5, var2);
      }
   }

   private void t2() {
      for (int var1 = this.getFillFormat().getSolidFillColor().getColorTransform().size() - 1; var1 >= 0; var1--) {
         IColorOperation var2 = this.getFillFormat().getSolidFillColor().getColorTransform().get_Item(var1);
         if (var2.getOperationType() == 5) {
            this.getFillFormat().getSolidFillColor().getColorTransform().removeAt(var1);
         }
      }
   }

   private float s7() {
      IGenericEnumerator var1 = this.getFillFormat().getSolidFillColor().getColorTransform().iterator();

      try {
         while (var1.hasNext()) {
            IColorOperation var2 = (IColorOperation)var1.next();
            if (var2.getOperationType() == 5) {
               return 1.0F - var2.getParameter();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return 0.0F;
   }
}
