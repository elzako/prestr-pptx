package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public class ChartCellCollection implements IChartCellCollection, r0g {
   private Chart n5;
   private final List<k4s> l6;
   private final Dictionary<String, List<k4s>> k5;
   private r0g u3;

   ChartCellCollection(r0g parentImmediate) {
      this.u3 = parentImmediate;
      this.l6 = new List<>();
      this.k5 = new Dictionary<>();
   }

   @Override
   public final String getCellsAddress() {
      if (this.l6.size() == 0) {
         return "";
      }

      ChartDataCell var1 = (ChartDataCell)this.l6.get_Item(0).n5();
      if (this.l6.size() == 1) {
         String var15 = var1.a6();
         String var16 = com.aspose.slides.ms.System.d1.t2(var15);

         for (int var17 = 0; var17 < var16.length(); var17++) {
            char var18 = var15.charAt(var17);
            if (com.aspose.slides.ms.System.t9.u3(var18)) {
               var16 = com.aspose.slides.ms.System.d1.n5(var16, var17, "$");
               break;
            }
         }

         return com.aspose.slides.ms.System.d1.n5(new String[]{this.n5(var1.getChartDataWorksheet().getName()), "!"}) + com.aspose.slides.ms.System.d1.n5(var16, 0, "$");
      } else {
         ChartDataCell var2 = var1;
         ChartDataCell var3 = var1;
         ChartDataCell var4 = var1;
         ChartDataCell var5 = var1;

         for (int var6 = 0; var6 < this.l6.size(); var6++) {
            ChartDataCell var7 = (ChartDataCell)this.l6.get_Item(var6).n5();
            if (var7.getColumn() < var2.getColumn()) {
               var2 = var7;
            }

            if (var7.getColumn() > var3.getColumn()) {
               var3 = var7;
            }

            if (var7.getRow() < var4.getRow()) {
               var4 = var7;
            }

            if (var7.getRow() > var5.getRow()) {
               var5 = var7;
            }
         }

         if (var2.getColumn() == var3.getColumn() && var5.getRow() - var4.getRow() + 1 == this.l6.size()) {
            String var21 = var4.a6();
            String var26 = com.aspose.slides.ms.System.d1.t2(var21);

            for (int var31 = 0; var31 < var26.length(); var31++) {
               char var37 = var21.charAt(var31);
               if (com.aspose.slides.ms.System.t9.u3(var37)) {
                  var26 = com.aspose.slides.ms.System.d1.n5(var26, var31, "$");
                  break;
               }
            }

            String var32 = var5.a6();
            String var38 = com.aspose.slides.ms.System.d1.t2(var32);

            for (int var42 = 0; var42 < var38.length(); var42++) {
               char var47 = var32.charAt(var42);
               if (com.aspose.slides.ms.System.t9.u3(var47)) {
                  var38 = com.aspose.slides.ms.System.d1.n5(var38, var42, "$");
                  break;
               }
            }

            return com.aspose.slides.ms.System.d1.n5(new String[]{
                  this.n5(var4.getChartDataWorksheet().getName()), "!", com.aspose.slides.ms.System.d1.n5(var26, 0, "$"), ":"
               })
               + com.aspose.slides.ms.System.d1.n5(var38, 0, "$");
         } else if (var4.getRow() == var3.getRow() && var3.getColumn() - var2.getColumn() + 1 == this.l6.size()) {
            String var20 = var2.a6();
            String var25 = com.aspose.slides.ms.System.d1.t2(var20);

            for (int var29 = 0; var29 < var25.length(); var29++) {
               char var35 = var20.charAt(var29);
               if (com.aspose.slides.ms.System.t9.u3(var35)) {
                  var25 = com.aspose.slides.ms.System.d1.n5(var25, var29, "$");
                  break;
               }
            }

            String var30 = var3.a6();
            String var36 = com.aspose.slides.ms.System.d1.t2(var30);

            for (int var41 = 0; var41 < var36.length(); var41++) {
               char var46 = var30.charAt(var41);
               if (com.aspose.slides.ms.System.t9.u3(var46)) {
                  var36 = com.aspose.slides.ms.System.d1.n5(var36, var41, "$");
                  break;
               }
            }

            return com.aspose.slides.ms.System.d1.n5(new String[]{
                  this.n5(var2.getChartDataWorksheet().getName()), "!", com.aspose.slides.ms.System.d1.n5(var25, 0, "$"), ":"
               })
               + com.aspose.slides.ms.System.d1.n5(var36, 0, "$");
         } else {
            String var19 = "";
            if (this.l6()) {
               if (this.l6.size() != 0) {
                  if (this.l6.size() == 1) {
                     ChartDataCell var22 = (ChartDataCell)this.l6.get_Item(0).n5();
                     String var8 = var22.a6();
                     String var9 = com.aspose.slides.ms.System.d1.t2(var8);

                     for (int var10 = 0; var10 < var9.length(); var10++) {
                        char var11 = var8.charAt(var10);
                        if (com.aspose.slides.ms.System.t9.u3(var11)) {
                           var9 = com.aspose.slides.ms.System.d1.n5(var9, var10, "$");
                           break;
                        }
                     }

                     var19 = com.aspose.slides.ms.System.d1.n5(new String[]{this.n5(var22.getChartDataWorksheet().getName()), "!"})
                        + com.aspose.slides.ms.System.d1.n5(var9, 0, "$");
                  } else {
                     ChartDataCell var23 = (ChartDataCell)this.l6.get_Item(0).n5();
                     ChartDataCell var27 = (ChartDataCell)this.l6.get_Item(this.l6.size() - 1).n5();
                     String var33 = var23.a6();
                     String var39 = com.aspose.slides.ms.System.d1.t2(var33);

                     for (int var43 = 0; var43 < var39.length(); var43++) {
                        char var12 = var33.charAt(var43);
                        if (com.aspose.slides.ms.System.t9.u3(var12)) {
                           var39 = com.aspose.slides.ms.System.d1.n5(var39, var43, "$");
                           break;
                        }
                     }

                     String var44 = var27.a6();
                     String var48 = com.aspose.slides.ms.System.d1.t2(var44);

                     for (int var13 = 0; var13 < var48.length(); var13++) {
                        char var14 = var44.charAt(var13);
                        if (com.aspose.slides.ms.System.t9.u3(var14)) {
                           var48 = com.aspose.slides.ms.System.d1.n5(var48, var13, "$");
                           break;
                        }
                     }

                     var19 = com.aspose.slides.ms.System.d1.n5(new String[]{
                           this.n5(var23.getChartDataWorksheet().getName()), "!", com.aspose.slides.ms.System.d1.n5(var39, 0, "$"), ":"
                        })
                        + com.aspose.slides.ms.System.d1.n5(var48, 0, "$");
                  }
               }
            } else {
               for (int var24 = 0; var24 < this.l6.size(); var24++) {
                  ChartDataCell var28 = (ChartDataCell)this.l6.get_Item(var24).n5();
                  String var34 = var28.a6();
                  String var40 = com.aspose.slides.ms.System.d1.t2(var34);

                  for (int var45 = 0; var45 < var40.length(); var45++) {
                     char var49 = var34.charAt(var45);
                     if (com.aspose.slides.ms.System.t9.u3(var49)) {
                        var40 = com.aspose.slides.ms.System.d1.n5(var40, var45, "$");
                        break;
                     }
                  }

                  var19 = com.aspose.slides.ms.System.d1.n5(
                     var19,
                     com.aspose.slides.ms.System.d1.n5(new String[]{this.n5(var28.getChartDataWorksheet().getName()), "!"})
                        + com.aspose.slides.ms.System.d1.n5(var40, 0, "$")
                  );
                  if (this.l6.size() > 1 && var24 < this.l6.size() - 1) {
                     var19 = com.aspose.slides.ms.System.d1.n5(var19, com.aspose.slides.internal.x7n.l6.u3().n3().k5());
                  }
               }
            }

            return var19;
         }
      }
   }

   @Override
   public final String getConcatenatedValuesFromCells() {
      String var1 = "";
      IGenericEnumerator var2 = this.iterator();

      try {
         while (var2.hasNext()) {
            ChartDataCell var3 = (ChartDataCell)var2.next();
            var1 = com.aspose.slides.ms.System.d1.n5(var1, com.aspose.slides.ms.System.d1.n5(new Object[]{var3.h0(), ' '}));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (!"".equals(var1)) {
         var1 = com.aspose.slides.ms.System.d1.n5(var1, var1.length() - 1);
      }

      return var1;
   }

   @Override
   public final IChartDataCell get_Item(int index) {
      return this.l6.get_Item(index).n5();
   }

   @Override
   public final void add(IChartDataCell cell) {
      if (cell == null) {
         throw new ArgumentNullException();
      }

      String var2 = ((ChartDataCell)cell).a6();
      k4s var3 = new k4s(cell, this);
      if (!this.k5.containsKey(var2)) {
         this.k5.addItem(var2, new List<>());
      }

      List var4 = this.k5.get_Item(var2);
      int var5 = -1;

      for (int var6 = 0; var6 < var4.size(); var6++) {
         var5 = this.l6.indexOf((k4s)var4.get_Item(var6), var5 + 1);
         if (var5 != -1) {
            this.l6.set_Item(var5, var3);
         }

         var4.set_Item(var6, var3);
      }

      this.l6.addItem(var3);
      var4.addItem(var3);
   }

   @Override
   public final void add(Object value) {
      ChartDataCell var2 = ((ChartDataWorkbook)this.k5().getChartData().getChartDataWorkbook()).t2();
      var2.setValue(value);
      this.add(var2);
   }

   @Override
   public final void removeAt(int index) {
      ChartDataCell var2 = (ChartDataCell)this.l6.get_Item(index).n5();
      if (var2 != null && this.k5.containsKey(var2.a6())) {
         this.k5.get_Item(var2.a6()).removeItem(this.l6.get_Item(index));
      }

      this.l6.removeAt(index);
   }

   @Override
   public final int getCount() {
      return this.l6.size();
   }

   @Override
   public final IGenericEnumerator<IChartDataCell> iterator() {
      List var1 = new List();
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            k4s var3 = (k4s)var2.next();
            var1.addItem((ChartDataCell)var3.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return new r7c(var1);
   }

   public final IGenericEnumerator<IChartDataCell> iteratorJava() {
      List var1 = new List();
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            k4s var3 = (k4s)var2.next();
            var1.addItem((ChartDataCell)var3.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return new l2p(var1);
   }

   final void n5(IGenericEnumerable<ChartDataCell> var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            ChartDataCell var4 = (ChartDataCell)var3.next();
            var2.addItem(new k4s(var4, this));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.l6.addRange(var2);
      List$Enumerator var15 = var2.iterator();

      try {
         while (var15.hasNext()) {
            k4s var5 = (k4s)var15.next();
            String var6 = ((ChartDataCell)var5.n5()).a6();
            if (!this.k5.containsKey(var6)) {
               this.k5.addItem(var6, new List<>());
            }

            List var7 = this.k5.get_Item(var6);
            var7.addItem(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
            var15.dispose();
         }
      }
   }

   final String n5() {
      if (this.l6.size() == 0) {
         return "";
      }

      ChartDataCell var1 = (ChartDataCell)this.l6.get_Item(0).n5();
      if (this.l6.size() != 1) {
         String var12 = var1.getChartDataWorksheet().getName();

         for (int var13 = 1; var13 < this.l6.size(); var13++) {
            if (!com.aspose.slides.ms.System.d1.a6(var12, ((ChartDataCell)this.l6.get_Item(var13).n5()).getChartDataWorksheet().getName())) {
               throw new ArgumentException("Cells must be on the same worksheet");
            }
         }

         ChartDataCell var14 = var1;
         ChartDataCell var15 = var1;
         ChartDataCell var16 = var1;
         ChartDataCell var6 = var1;

         for (int var7 = 0; var7 < this.l6.size(); var7++) {
            ChartDataCell var8 = (ChartDataCell)this.l6.get_Item(var7).n5();
            if (var8.getColumn() < var14.getColumn()) {
               var14 = var8;
            }

            if (var8.getColumn() > var15.getColumn()) {
               var15 = var8;
            }

            if (var8.getRow() < var16.getRow()) {
               var16 = var8;
            }

            if (var8.getRow() > var6.getRow()) {
               var6 = var8;
            }
         }

         String var17 = com.aspose.slides.ms.System.d1.n5(new String[]{var12, "!"});
         char[] var9 = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
         int var10 = com.aspose.slides.ms.System.d1.n5(var14.a6(), var9);
         String var21 = com.aspose.slides.ms.System.d1.l6(var14.a6(), 0, var10);
         var17 = com.aspose.slides.ms.System.d1.n5(var17, com.aspose.slides.ms.System.d1.n5(new String[]{"$", var21}));
         var10 = com.aspose.slides.ms.System.d1.n5(var16.a6(), var9);
         String var11 = com.aspose.slides.ms.System.d1.k5(var16.a6(), var10);
         var17 = com.aspose.slides.ms.System.d1.n5(var17, com.aspose.slides.ms.System.d1.n5(new String[]{"$", var11}));
         var10 = com.aspose.slides.ms.System.d1.n5(var15.a6(), var9);
         var21 = com.aspose.slides.ms.System.d1.l6(var15.a6(), 0, var10);
         var17 = com.aspose.slides.ms.System.d1.n5(var17, com.aspose.slides.ms.System.d1.n5(new String[]{":", "$", var21}));
         var10 = com.aspose.slides.ms.System.d1.n5(var6.a6(), var9);
         var11 = com.aspose.slides.ms.System.d1.k5(var6.a6(), var10);
         return com.aspose.slides.ms.System.d1.n5(var17, com.aspose.slides.ms.System.d1.n5(new String[]{"$", var11}));
      } else {
         String var2 = var1.a6();
         String var3 = com.aspose.slides.ms.System.d1.t2(var2);

         for (int var4 = 0; var4 < var3.length(); var4++) {
            char var5 = var2.charAt(var4);
            if (com.aspose.slides.ms.System.t9.u3(var5)) {
               var3 = com.aspose.slides.ms.System.d1.n5(var3, var4, "$");
               break;
            }
         }

         return com.aspose.slides.ms.System.d1.n5(new String[]{var1.getChartDataWorksheet().getName(), "!"}) + com.aspose.slides.ms.System.d1.n5(var3, 0, "$");
      }
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u3;
   }

   private boolean l6() {
      int var1 = -1;
      int var2 = -1;
      String var3 = null;

      for (int var4 = 0; var4 < this.l6.size(); var4++) {
         ChartDataCell var5 = (ChartDataCell)this.l6.get_Item(var4).n5();
         if ((var1 != -1 || var3 != null)
            && (var2 != -1 || var3 != null)
            && (var5.getColumn() - var1 != 1 || !com.aspose.slides.ms.System.d1.a6(var3, var5.getChartDataWorksheet().getName()))
            && (var5.getRow() - var2 != 1 || !com.aspose.slides.ms.System.d1.a6(var3, var5.getChartDataWorksheet().getName()))) {
            return false;
         }

         var1 = var5.getColumn();
         var2 = var5.getRow();
         var3 = var5.getChartDataWorksheet().getName();
      }

      return true;
   }

   private String n5(String var1) {
      return com.aspose.slides.internal.r7c.c8.n5(var1, "[\\w.]", "").length() > 0 ? com.aspose.slides.ms.System.d1.n5(new String[]{"'", var1, "'"}) : var1;
   }

   private Chart k5() {
      if (this.n5 == null) {
         Chart[] var1 = new Chart[]{this.n5};
         d0u.n5(Chart.class, this.u3, var1);
         this.n5 = var1[0];
      }

      return this.n5;
   }
}
