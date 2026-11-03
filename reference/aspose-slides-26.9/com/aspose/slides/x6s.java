package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

final class x6s implements IGenericEnumerable<KeyValuePair<String, SortedList<Long, SortedList<String, ChartDataCell>>>> {
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private double t2;
   private double s7;
   SortedList<String, SortedList<Long, SortedList<String, ChartDataCell>>> n5;
   ChartDataWorksheet l6;
   SortedList<Long, q8g> k5 = new SortedList<>();
   SortedList<Long, r6i> u3 = new SortedList<>();

   final int n5() {
      return this.a6;
   }

   private void n5(int var1) {
      this.a6 = var1;
   }

   final int l6() {
      return this.u9;
   }

   private void l6(int var1) {
      this.u9 = var1;
   }

   final int k5() {
      return this.h0;
   }

   private void k5(int var1) {
      this.h0 = var1;
   }

   final int u3() {
      return this.c8;
   }

   private void u3(int var1) {
      this.c8 = var1;
   }

   final ChartDataCell n5(int var1, int var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("row");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("column");
      }

      String var3 = k5(var1, var2);
      return this.n5(var3);
   }

   final IGenericList<ChartDataCell> n5(int var1, int var2, int var3, int var4) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("firstRow");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("firstColumn");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("lastRow");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("lastColumn");
      }

      int var5 = com.aspose.slides.ms.System.q1.l6(var1, var3);
      int var6 = com.aspose.slides.ms.System.q1.l6(var2, var4);
      int var7 = com.aspose.slides.ms.System.q1.n5(var1, var3);
      int var8 = com.aspose.slides.ms.System.q1.n5(var2, var4);
      if (this.n5() > var5) {
         var5 = this.n5();
      }

      if (this.k5() > var6) {
         var6 = this.k5();
      }

      if (this.l6() < var7) {
         var7 = this.l6();
      }

      if (this.u3() < var8) {
         var8 = this.u3();
      }

      List var9 = new List();

      for (int var10 = var5; var10 <= var7; var10++) {
         for (int var11 = var6; var11 <= var8; var11++) {
            ChartDataCell var12 = this.n5(var10, var11);
            if (var12 != null && !var12.t2().y4()) {
               var9.addItem(this.l6(var10, var11));
            }
         }
      }

      return var9;
   }

   final ChartDataCell n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("cellName");
      }

      if (com.aspose.slides.ms.System.d1.a6(var1, com.aspose.slides.ms.System.d1.n5)) {
         throw new ArgumentException("The argument is empty string.", "cellName");
      }

      int var2 = this.k5(var1);
      if (var2 == -1) {
         throw new ArgumentException("The argument has not correct format.", "cellName");
      }

      String var3 = com.aspose.slides.ms.System.d1.l6(var1, 0, var2);
      String var4 = com.aspose.slides.ms.System.d1.k5(var1, var2);
      long var5 = com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.z3.u3(var4) / 1000.0), 14);
      SortedList var7 = null;
      SortedList[] var8 = new SortedList[]{var7};
      boolean var9 = !this.n5.tryGetValue(var3, var8);
      var7 = var8[0];
      if (var9) {
         return null;
      }

      SortedList var10 = null;
      SortedList[] var11 = new SortedList[]{var10};
      boolean var12 = !var7.tryGetValue(var5, var11);
      var10 = var11[0];
      if (var12) {
         return null;
      }

      Object var13 = null;
      ChartDataCell[] var14 = new ChartDataCell[]{(ChartDataCell)var13};
      var10.tryGetValue(var4, var14);
      return var14[0];
   }

   final double a6() {
      return this.t2;
   }

   final void n5(double var1) {
      this.t2 = var1;
   }

   final double u9() {
      return this.s7;
   }

   final void l6(double var1) {
      this.s7 = var1;
   }

   x6s(ChartDataWorksheet var1) {
      this.n5 = new SortedList<>();
      this.l6 = var1;
      this.t2();
   }

   final void h0() {
      this.n5.clear();
      this.t2();
   }

   final void n5(w9f var1, List<a1k> var2) {
      w9f[] var3 = var1.n5("row", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");

      for (int var4 = 0; var4 < var3.length; var4++) {
         q2q var5 = (q2q)var3[var4];
         w9f[] var6 = var5.n5("c", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");

         for (int var7 = 0; var7 < var6.length; var7++) {
            c0 var8 = (c0)var6[var7];
            ChartDataCell var9 = new ChartDataCell(this, var8);
            this.n5(var9);
         }
      }
   }

   public final ChartDataCell l6(int var1, int var2) {
      return this.l6(k5(var1, var2));
   }

   static String k5(int var0, int var1) {
      int var2 = var1 / "ABCDEFGHIJKLMNOPQRSTUVWXYZ".length();
      String var3;
      if (var2 > 26) {
         var3 = com.aspose.slides.ms.System.d1.n5(new Object[]{
            com.aspose.slides.ms.System.t9.q0(
               "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                  .charAt(
                     ((var1 / "ABCDEFGHIJKLMNOPQRSTUVWXYZ".length() - 1) / "ABCDEFGHIJKLMNOPQRSTUVWXYZ".length() - 1) % "ABCDEFGHIJKLMNOPQRSTUVWXYZ".length()
                  )
            ),
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((var1 / "ABCDEFGHIJKLMNOPQRSTUVWXYZ".length() - 1) % "ABCDEFGHIJKLMNOPQRSTUVWXYZ".length()),
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(var1 % "ABCDEFGHIJKLMNOPQRSTUVWXYZ".length())
         });
      } else if (var2 > 0) {
         var3 = com.aspose.slides.ms.System.d1.n5(new Object[]{
            com.aspose.slides.ms.System.t9.q0("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(var2 - 1)),
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(var1 - var2 * "ABCDEFGHIJKLMNOPQRSTUVWXYZ".length())
         });
      } else {
         var3 = com.aspose.slides.ms.System.t9.q0("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(var1));
      }

      return com.aspose.slides.ms.System.d1.n5(new String[]{var3, com.aspose.slides.ms.System.a3.l6(var0 + 1)});
   }

   public final ChartDataCell l6(String var1) {
      String var2 = com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.d1.n5(var1, "$", ""));
      int var3 = com.aspose.slides.ms.System.d1.n5(var2, new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'});
      String var4 = com.aspose.slides.ms.System.d1.l6(var2, 0, var3);
      String var5 = com.aspose.slides.ms.System.d1.k5(var2, var3);
      long var6 = com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.z3.u3(var5) / 1000.0), 14);
      SortedList var8 = null;
      SortedList[] var9 = new SortedList[]{var8};
      boolean var10 = this.n5.tryGetValue(var4, var9);
      var8 = var9[0];
      if (var10) {
         SortedList var11 = null;
         SortedList[] var12 = new SortedList[]{var11};
         boolean var13 = var8.tryGetValue(var6, var12);
         var11 = var12[0];
         if (var13) {
            ChartDataCell var14 = null;
            ChartDataCell[] var15 = new ChartDataCell[]{var14};
            boolean var16 = var11.tryGetValue(var5, var15);
            var14 = var15[0];
            if (var16) {
               return var14;
            }
         }
      }

      ChartDataCell var19 = new ChartDataCell(this, var2);
      this.n5(var19);
      var19.n5 = true;
      return var19;
   }

   final void n5(ChartDataCell var1) {
      int var2 = this.k5(var1.a6());
      String var3 = com.aspose.slides.ms.System.d1.l6(var1.a6(), 0, var2);
      String var4 = com.aspose.slides.ms.System.d1.k5(var1.a6(), var2);
      long var5 = com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.ms.System.q1.k5(com.aspose.slides.ms.System.z3.u3(var4) / 1000.0), 14);
      SortedList var7 = null;
      SortedList[] var8 = new SortedList[]{var7};
      boolean var9 = !this.n5.tryGetValue(var3, var8);
      var7 = var8[0];
      if (var9) {
         SortedList var10 = new SortedList();
         SortedList var11 = new SortedList();
         var11.addItem(var4, var1);
         var10.addItem(var5, var11);
         this.n5.addItem(var3, var10);
      } else {
         SortedList var15 = null;
         SortedList[] var17 = new SortedList[]{var15};
         boolean var12 = !var7.tryGetValue(var5, var17);
         var15 = var17[0];
         if (var12) {
            SortedList var13 = new SortedList();
            var13.addItem(var4, var1);
            var7.addItem(var5, var13);
         } else {
            var15.addItem(var4, var1);
         }
      }

      if (var1.getRow() < this.n5()) {
         this.n5(var1.getRow());
      }

      if (var1.getRow() > this.l6()) {
         this.l6(var1.getRow());
      }

      if (var1.getColumn() < this.k5()) {
         this.k5(var1.getColumn());
      }

      if (var1.getColumn() > this.u3()) {
         this.u3(var1.getColumn());
      }
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, SortedList<Long, SortedList<String, ChartDataCell>>>> iterator() {
      return this.n5.iterator();
   }

   public final int c8() {
      return this.n5.size();
   }

   private void t2() {
      this.n5(Integer.MAX_VALUE);
      this.k5(Integer.MAX_VALUE);
      this.l6(Integer.MIN_VALUE);
      this.u3(Integer.MIN_VALUE);
   }

   private int k5(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         if (var1.charAt(var2) >= '0' && var1.charAt(var2) <= '9') {
            return var2;
         }
      }

      return -1;
   }
}
