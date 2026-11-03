package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class b6 extends z6 {
   private j8 k5;
   private j8 u3;
   private j8 a6;
   private j8 u9;
   private List<j8> h0;
   private j8 c8;
   private List<j8> t2;
   private List<j8> s7;
   private j8 x8;
   private j8 n3;
   private j8 y4;
   private j8 e2;
   private j8 t9;
   private j8 z1;
   private List<j8> t4;
   private j8 q0;
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9(
      "application/vnd.openxmlformats-officedocument.extended-properties+xml",
      "application/vnd.openxmlformats-package.core-properties+xml",
      "application/vnd.openxmlformats-officedocument.custom-properties+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.calcChain+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.chartsheet+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.connections+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.dialogsheet+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.externalLink+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.sheetMetadata+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.revisionHeaders+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.userNames+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.volatileDependencies+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml",
      "application/vnd.ms-excel.sheet.macroEnabled.main+xml",
      "application/vnd.ms-excel.template.macroEnabled.main+xml",
      "application/vnd.openxmlformats-officedocument.spreadsheetml.template.main+xml",
      "application/vnd.ms-excel.sheet.binary.macroEnabled.main"
   );

   public final j8 y4() {
      return this.a6;
   }

   public final j8 e2() {
      return this.u3;
   }

   public final j8 t9() {
      return this.k5;
   }

   public final j8 z1() {
      return this.u9;
   }

   public final j8 t4() {
      return this.n3;
   }

   public final j8 q0() {
      return this.t9;
   }

   public final j8 z3() {
      return this.q0;
   }

   public final j8[] m1() {
      return this.t4.toArray(new j8[0]);
   }

   public b6() {
      this.x8();
   }

   public b6(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.b8.s7 var2) {
      this.l6(var1, false, var2);
   }

   @Override
   public void n5(IGenericList<j8> var1) {
      if (this.h0 == null) {
         this.h0 = new List<>();
      }

      if (this.t2 == null) {
         this.t2 = new List<>();
      }

      if (this.s7 == null) {
         this.s7 = new List<>();
      }

      if (this.t4 == null) {
         this.t4 = new List<>();
      }

      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            j8 var3 = (j8)var2.next();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      String var8 = this.c8().n5(r6.n5)[0].n5();
      j8[] var4 = new j8[]{this.q0};
      boolean var5 = !this.l6.tryGetValue(var8, var4);
      this.q0 = var4[0];
      if (var5) {
         throw new t5(com.aspose.slides.ms.System.d1.n5("Error reading pptx presentation: can't find \"{0}\" entry in \"parts\" list.", new Object[]{var8}));
      }
   }

   @Override
   public void n5(j8 var1) {
      if (this.h0 == null) {
         this.h0 = new List<>();
      }

      if (this.t2 == null) {
         this.t2 = new List<>();
      }

      if (this.s7 == null) {
         this.s7 = new List<>();
      }

      if (this.t4 == null) {
         this.t4 = new List<>();
      }

      if (var1.y4() instanceof r4) {
         switch (z3.n5(var1.y4().n5())) {
            case 0:
               this.k5 = var1;
               break;
            case 1:
               this.u3 = var1;
               break;
            case 2:
               this.a6 = var1;
               break;
            case 3:
               this.u9 = var1;
               break;
            case 4:
               this.h0.addItem(var1);
               break;
            case 5:
               this.c8 = var1;
               break;
            case 6:
               this.t2.addItem(var1);
               break;
            case 7:
               this.s7.addItem(var1);
               break;
            case 8:
               this.x8 = var1;
               break;
            case 9:
               this.n3 = var1;
               break;
            case 10:
               this.y4 = var1;
               break;
            case 11:
               this.e2 = var1;
               break;
            case 12:
               this.t9 = var1;
               break;
            case 13:
               this.z1 = var1;
               break;
            case 14:
               this.t4.addItem(var1);
               break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
               this.q0 = var1;
         }
      } else if (var1.y4() == null) {
         var1.l6(new n8());
      }
   }
}
