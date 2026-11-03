package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public class ChartDataCell implements IChartDataCell {
   private t4z l6;
   private int k5;
   boolean n5;
   private x6s u3;
   private String a6;
   private String u9 = "";
   private t3u h0 = new t3u();

   @Override
   public final int getRow() {
      return this.t2().l6() - 1;
   }

   @Override
   public final int getColumn() {
      return this.t2().k5() - 1;
   }

   @Override
   public final Object getValue() {
      return this.t2().u3();
   }

   @Override
   public final void setValue(Object value) {
      this.n5(value);
   }

   @Override
   public final String getFormula() {
      return this.t2().n5(0);
   }

   @Override
   public final void setFormula(String value) {
      this.l6(value);
   }

   @Override
   public final String getR1C1Formula() {
      return this.t2().n5(1);
   }

   @Override
   public final void setR1C1Formula(String value) {
      this.k5(value);
   }

   @Override
   public final IChartDataWorksheet getChartDataWorksheet() {
      return this.l6();
   }

   @Override
   public final boolean isHidden() {
      boolean var1 = this.l6().l6().u3.containsKey(this.t2().k5() & 4294967295L)
         && com.aspose.slides.ms.System.z3.n5(this.l6().l6().u3.get_Item(this.t2().k5() & 4294967295L).n5());
      boolean var2 = this.l6().l6().k5.containsKey(this.t2().l6() & 4294967295L)
         && com.aspose.slides.ms.System.z3.n5(this.l6().l6().k5.get_Item(this.t2().l6() & 4294967295L).n5());
      return com.aspose.slides.ms.System.z3.n5(var1 || var2);
   }

   @Override
   public final String getCustomNumberFormat() {
      return this.u9;
   }

   @Override
   public final void setCustomNumberFormat(String value) {
      if (value == null) {
         throw new ArgumentNullException("Can't be null. To reset format use empty string.");
      }

      this.u9 = value;
   }

   @Override
   public final byte getPresetNumberFormat() {
      return (this.h0.u3() & 4294967295L) < 164L ? (byte)this.h0.u3() : 0;
   }

   @Override
   public final void setPresetNumberFormat(byte value) {
      this.h0.l6(value & 0xFF);
   }

   @Override
   public final void calculate(boolean updateValues) {
      this.t2().n5(updateValues);
   }

   ChartDataCell(x6s parent) {
      this(parent, com.aspose.slides.ms.System.d1.n5);
   }

   ChartDataCell(x6s parent, String name) {
      this.n5(parent, name);
   }

   private void n5(x6s var1, String var2) {
      this.u3 = var1;
      this.n5(new t4z(this));
      this.n5 = false;
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         this.u3(var2);
      }
   }

   final void n5(int var1) {
      this.t2().n5(Integer.valueOf(var1));
      this.e2();
   }

   final void n5(String var1) {
      this.t2().n5(var1);
      this.e2();
   }

   final void n5(Object var1) {
      this.t2().n5(var1);
      this.e2();
   }

   final void l6(String var1) {
      this.t2().n5(var1, 0);
      this.e2();
   }

   final void k5(String var1) {
      this.t2().n5(var1, 1);
      this.e2();
   }

   final byte n5() {
      return this.t2().c8();
   }

   final ChartDataWorksheet l6() {
      return this.u3.l6;
   }

   final ChartDataWorkbook k5() {
      return this.u3.l6.u3();
   }

   final String n5(boolean var1) {
      String var2 = com.aspose.slides.ms.System.d1.l6(this.u9);
      if (com.aspose.slides.ms.System.d1.a6(var2, com.aspose.slides.ms.System.d1.n5)) {
         var2 = n5(this.getPresetNumberFormat() & 255, var1);
      }

      return var2;
   }

   final boolean u3() {
      if (!com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.l6(this.u9), com.aspose.slides.ms.System.d1.n5)) {
         return false;
      }

      int var1 = this.getPresetNumberFormat() & 255;
      return var1 == 0;
   }

   final String a6() {
      return this.a6;
   }

   final void u3(String var1) {
      this.a6 = var1;
      int var2 = 0;
      int var3 = 0;
      int[] var4 = new int[]{0};
      int[] var5 = new int[]{0};
      ChartDataWorkbook.n5(this.a6, var4, var5);
      var2 = var4[0];
      var3 = var5[0];
      this.t2().n5(var2, var3);
   }

   final int u9() {
      return com.aspose.slides.internal.v6g.k5.l6(this.t2().u3(), Integer.class) ? com.aspose.slides.internal.v6g.k5.u3(this.t2().u3(), int.class) : 0;
   }

   final String h0() {
      return com.aspose.slides.ms.System.z3.t9(this.t2().u3(), com.aspose.slides.internal.x7n.l6.k5());
   }

   final t3u c8() {
      return this.h0;
   }

   final t4z t2() {
      return this.l6;
   }

   private void n5(t4z var1) {
      this.l6 = var1;
   }

   final int s7() {
      a9f var1 = this.k5().u3;

      for (int var2 = var1.n5() - 1; var2 >= 0; var2--) {
         if (this.h0.n5() == var1.n5(var2).n5()
            && this.h0.l6() == var1.n5(var2).l6()
            && this.h0.k5() == var1.n5(var2).k5()
            && this.h0.u3() == var1.n5(var2).u3()
            && this.h0.a6() == var1.n5(var2).a6()
            && this.h0.u9() == var1.n5(var2).u9()
            && this.h0.h0() == var1.n5(var2).h0()
            && this.h0.c8() == var1.n5(var2).c8()
            && this.h0.t2() == var1.n5(var2).t2()
            && this.h0.s7() == var1.n5(var2).s7()
            && this.h0.x8() == var1.n5(var2).x8()
            && this.h0.n3() == var1.n5(var2).n3()
            && this.h0.y4() == var1.n5(var2).y4()) {
            return var2;
         }
      }

      return var1.n5(this.h0);
   }

   final h6g x8() {
      long var1 = this.h0.u3();
      l1h var3 = this.k5().k5;
      IGenericEnumerator var4 = var3.iterator();

      try {
         while (var4.hasNext()) {
            h6g var5 = (h6g)var4.next();
            if (var5.l6() == var1) {
               return var5;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return null;
   }

   final h6g n3() {
      long var1 = 164L;
      String var3 = this.u9;
      l1h var4 = this.k5().k5;
      IGenericEnumerator var5 = var4.iterator();

      try {
         while (var5.hasNext()) {
            h6g var6 = (h6g)var5.next();
            if (com.aspose.slides.ms.System.d1.a6(var6.n5(), var3)) {
               return var6;
            }

            if ((var6.l6() & 4294967295L) >= (var1 & 4294967295L)) {
               var1 = (var6.l6() & 4294967295L) + 1L & 4294967295L;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      h6g var11 = new h6g();
      var11.n5(var1);
      var11.n5(var3);
      var4.n5(var11);
      return var11;
   }

   final void n5(t3u var1) {
      t3u var2 = new t3u();
      var2.n5(var1.n5());
      var2.n5(var1.l6());
      var2.l6(var1.k5());
      var2.l6(var1.u3());
      var2.k5(var1.a6());
      var2.u3(var1.u9());
      var2.a6(var1.h0());
      var2.n5(var1.c8());
      var2.l6(var1.t2());
      var2.k5(var1.s7());
      var2.u3(var1.x8());
      var2.a6(var1.n3());
      var2.u9(var1.y4());
      com.aspose.slides.internal.k4y.g4t var3 = var1.e2();
      if (var3 != null) {
         var2.n5(new com.aspose.slides.internal.k4y.g4t());
         var2.e2().n5(var3.n5());
         var2.e2().l6(var3.l6());
         var2.e2().l6(var3.a6());
         var2.e2().l6(var3.h0());
         var2.e2().k5(var3.t2());
         var2.e2().k5(var3.u9());
         var2.e2().k5(var3.c8());
         var2.e2().n5(var3.k5());
         var2.e2().n5(var3.u3());
      }

      this.h0 = var2;
   }

   final int y4() {
      return this.k5;
   }

   final void l6(int var1) {
      this.k5 = var1;
   }

   private void e2() {
      if (this.l6() != null && !this.n5) {
         this.l6().l6().n5(this);
         this.n5 = true;
      }
   }

   private static String n5(int var0, boolean var1) {
      if (var1) {
         if (var0 == 14) {
            return com.aspose.slides.ms.System.d1.u9(com.aspose.slides.internal.x7n.l6.u3().a6().q0());
         }

         if (var0 == 15) {
            return com.aspose.slides.ms.System.d1.n5(
               "d{0}mmm{0}yy", new Object[]{com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x7n.l6.u3().a6().t9(), "/", "-")}
            );
         }

         if (var0 == 16) {
            return com.aspose.slides.ms.System.d1.n5(
               "d{0}mmm", new Object[]{com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x7n.l6.u3().a6().t9(), "/", "-")}
            );
         }

         if (var0 == 17) {
            return com.aspose.slides.ms.System.d1.n5(
               "mmm{0}yy", new Object[]{com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x7n.l6.u3().a6().t9(), "/", "-")}
            );
         }

         if (var0 == 18) {
            return com.aspose.slides.ms.System.d1.n5("h:mm {0}", new Object[]{"tt"});
         }

         if (var0 == 19) {
            return com.aspose.slides.ms.System.d1.n5("h:mm:ss {0}", new Object[]{"tt"});
         }

         if (var0 == 22) {
            return com.aspose.slides.ms.System.d1.n5(
               "{0} h:mm", new Object[]{com.aspose.slides.ms.System.d1.u9(com.aspose.slides.internal.x7n.l6.u3().a6().q0())}
            );
         }
      }

      return k5(var0);
   }

   private static String k5(int var0) {
      switch (var0) {
         case 0:
            return "General";
         case 1:
            return "0";
         case 2:
            return "0.00";
         case 3:
            return "#,##0";
         case 4:
            return "#,##0.00";
         case 5:
            return "$#,##0;$-#,##0";
         case 6:
            return "$#,##0;[Red]$-#,##0";
         case 7:
            return "$#,##0.00;$-#,##0.00";
         case 8:
            return "$#,##0.00;[Red]$-#,##0.00";
         case 9:
            return "0%";
         case 10:
            return "0.00%";
         case 11:
            return "0.00E+00";
         case 12:
            return "# ?/?";
         case 13:
            return "# /";
         case 14:
            return "m/d/yyyy";
         case 15:
            return "d\\-mmm\\-yy";
         case 16:
            return "d\\-mmm";
         case 17:
            return "mmm\\-yy";
         case 18:
            return "h:mm\\ AM/PM";
         case 19:
            return "h:mm:ss\\ AM/PM";
         case 20:
            return "h:mm";
         case 21:
            return "h:mm:ss";
         case 22:
            return "m/d/yyyy\\ h:mm";
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         default:
            return com.aspose.slides.ms.System.d1.n5;
         case 37:
            return "#,##0;-#,##0";
         case 38:
            return "#,##0;[Red]-#,##0";
         case 39:
            return "#,##0.00;-#,##0.00";
         case 40:
            return "#,##0.00;[Red]-#,##0.00";
         case 41:
            return "_ * #,##0_ ;_ * \"_ ;_ @_";
         case 42:
            return "_ $* #,##0_ ;_ $* \"_ ;_ @_";
         case 43:
            return "_ * #,##0.00_ ;_ * \"??_ ;_ @_";
         case 44:
            return "_(\"$\"* # ##0,00_);_(\"$\"* (# ##0,00);_(\"$\"* \"-\"??_);_(@_)";
         case 45:
            return "mm:ss";
         case 46:
            return "h :mm:ss";
         case 47:
            return "mm:ss.0";
         case 48:
            return "##0.0E+00";
         case 49:
            return "@";
      }
   }

   ChartDataCell(x6s parent, c0 elemCell) {
      this.u3 = parent;
      this.n5(new t4z(this));
      this.t2().z1().l6 = elemCell.l6();
      this.n5(this.k5().u3.n5((int)elemCell.a6()));
      if ((this.h0.u3() & 4294967295L) >= 164L && this.h0.t2() != 0) {
         h6g var3 = this.x8();
         if (var3 != null) {
            this.u9 = var3.n5();
         }
      }

      if (elemCell.k5() == null) {
         this.t2().z1().n5 = null;
      } else {
         switch (elemCell.l6()) {
            case 0:
               Integer var4 = b4x.l6((String)elemCell.k5()).n5();
               if (var4 != null) {
                  this.t2().z1().n5 = var4;
               }
               break;
            case 1:
               Double var6 = b4x.n5((String)elemCell.k5()).n5();
               if (var6 != null) {
                  this.t2().z1().n5 = var6;
               }
               break;
            case 2:
            case 4:
            case 5:
            default:
               this.t2().z1().n5 = elemCell.k5();
               break;
            case 3:
               this.t2().z1().n5 = this.k5().l6.n5(com.aspose.slides.ms.System.z3.h0(elemCell.k5()));
               break;
            case 6:
               Double var5 = b4x.n5((String)elemCell.k5(), 0).n5();
               if (var5 != null) {
                  this.t2().z1().n5 = var5;
               }
         }
      }

      this.u3(elemCell.u3());
      this.n5 = true;
   }
}
