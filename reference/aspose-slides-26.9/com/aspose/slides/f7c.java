package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class f7c extends v6g {
   private g3y n5;
   private p7m t2;
   List<h2v> l6 = new List<>();
   protected List<q8o> k5 = new List<>();
   protected List<a6y> u3 = new List<>();
   protected List<e1o> a6 = new List<>();
   protected List<l1z> u9 = new List<>();
   protected List<q3v> h0 = new List<>();
   protected List<b3u> c8 = new List<>();

   @Override
   public int O_() {
      return 2;
   }

   protected f7c(p7m var1, g3y var2) {
      this.n5 = var2;
      this.t2 = var1;
   }

   void s7() {
      if (ChartTypeCharacterizer.c8(this.e2().u9().getType())) {
         this.t2();
      } else if (ChartTypeCharacterizer.s7(this.e2().u9().getType())) {
         this.c8();
      }

      this.u3();
      List$Enumerator var1 = this.l6.iterator();

      try {
         while (var1.hasNext()) {
            h2v var2 = (h2v)var1.next();
            if (var2.e2().x8() != null && !var2.e2().c8()) {
               q3v var3 = new q3v(var2);
               this.h0.addItem(var3);
               this.n5(var3);
            }

            if (var2.e2().n3() != null && !var2.e2().c8()) {
               b3u var13 = new b3u(var2);
               this.c8.addItem(var13);
               this.n5(var13);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      if (this.e2().a6().size() > 0 && this.l6.size() > 1) {
         List$Enumerator var12 = this.e2().a6().iterator();

         try {
            while (var12.hasNext()) {
               w3q var14 = (w3q)var12.next();
               e1o var4 = null;
               switch (var14.k5().getTrendlineType()) {
                  case 0:
                     var4 = new v4b(var14, this);
                     break;
                  case 1:
                     var4 = new g2n(var14, this);
                     break;
                  case 2:
                     var4 = new j1g(var14, this);
                     break;
                  case 3:
                     var4 = new o7y(var14, this);
                     break;
                  case 4:
                     var4 = new s3k(var14, this);
                     break;
                  case 5:
                     var4 = new e5y(var14, this);
               }

               this.a6.addItem(var4);
               this.n5(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
               var12.dispose();
            }
         }
      }

      this.h0();
   }

   private void u3() {
      w3 var1 = null;
      if (ChartTypeCharacterizer.n5(this.e2().u9().getType()) == 2) {
         var1 = this.t9().k5;
      }

      if (ChartTypeCharacterizer.n5(this.e2().u9().getType()) == 4) {
         var1 = this.t9().l6;
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, o8r.class)) {
         List var2 = var1.n5().y4() == 0 ? this.e2().t2().l6() : this.e2().t2().k5();

         for (int var3 = 0; var3 < this.l6.size() && var3 < var2.size(); var3++) {
            double var4 = o8r.l6(((x4)var2.get_Item(var3)).l6());
            this.l6.get_Item(var3).e2().l6(var4);
            if (!this.l6.get_Item(var3).e2().c8() && !"".equals(((x4)var2.get_Item(var3)).l6().toString())) {
               this.l6.get_Item(var3).l6(var4);
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, u7.class)) {
         for (int var7 = 0; var7 < this.l6.size(); var7++) {
            this.l6.get_Item(var7).l6(var7 + 1.0);
         }
      }

      if (ChartTypeCharacterizer.n5(this.e2().u9().getType()) == 5) {
         boolean var8 = true;
         boolean var9 = false;

         for (int var6 = 0; var6 < this.l6.size(); var6++) {
            if (!var9 && !this.l6.get_Item(var6).e2().c8()) {
               var9 = true;
            }

            if (!this.l6.get_Item(var6).e2().c8() && !com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var6).y4())) {
               var8 = false;
               break;
            }
         }

         if (var8 && var9) {
            for (int var10 = 0; var10 < this.l6.size(); var10++) {
               this.l6.get_Item(var10).l6(var10 + 1.0);
               if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, u7.class)) {
                  this.l6.get_Item(var10).l6(this.l6.get_Item(var10).y4() + 0.5);
               }
            }
         }
      }
   }

   private void h0() {
      switch (ChartTypeCharacterizer.n5(this.e2().u9().getType())) {
         case 2:
         case 3:
            if (this.t9().l6.n5().c8().isLogarithmic()) {
               for (int var20 = 0; var20 < this.l6.size(); var20++) {
                  if (this.l6.get_Item(var20).n3() == 0.0) {
                     this.l6.get_Item(var20).e2().l6(true);
                     this.l6.get_Item(var20).l6(false);
                  } else {
                     this.l6.get_Item(var20).n5(this.t9().l6.n5().n5(this.l6.get_Item(var20).n3()));
                  }
               }
            }
            break;
         case 4:
            if (this.t9().k5.n5().c8().isLogarithmic()) {
               for (int var19 = 0; var19 < this.l6.size(); var19++) {
                  if (this.l6.get_Item(var19).n3() == 0.0) {
                     this.l6.get_Item(var19).e2().l6(true);
                     this.l6.get_Item(var19).l6(false);
                  } else {
                     this.l6.get_Item(var19).n5(this.t9().k5.n5().n5(this.l6.get_Item(var19).n3()));
                  }
               }
            }
            break;
         case 5:
            if (this.t9().l6.n5().c8().isLogarithmic()) {
               for (int var1 = 0; var1 < this.l6.size(); var1++) {
                  if (this.l6.get_Item(var1).n3() == 0.0) {
                     this.l6.get_Item(var1).e2().l6(true);
                     this.l6.get_Item(var1).l6(false);
                  } else {
                     this.l6.get_Item(var1).n5(this.t9().l6.n5().n5(this.l6.get_Item(var1).n3()));
                  }
               }
            }

            if (this.t9().k5.n5().c8().isLogarithmic()) {
               for (int var18 = 0; var18 < this.l6.size(); var18++) {
                  if (this.l6.get_Item(var18).y4() == 0.0) {
                     this.l6.get_Item(var18).e2().l6(true);
                     this.l6.get_Item(var18).l6(false);
                  } else {
                     this.l6.get_Item(var18).l6(this.t9().k5.n5().n5(this.l6.get_Item(var18).y4()));
                  }
               }
            }
      }

      if (this.t9().l6.n5().c8().isLogarithmic()) {
         List$Enumerator var21 = this.c8.iterator();

         try {
            while (var21.hasNext()) {
               b3u var2 = (b3u)var21.next();
               if (var2.t2() != 0.0) {
                  var2.a6(this.t9().l6.n5().n5(var2.t2()));
               }

               if (var2.s7() != 0.0) {
                  var2.u9(this.t9().l6.n5().n5(var2.s7()));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
               var21.dispose();
            }
         }
      }

      if (this.t9().k5.n5().c8().isLogarithmic()) {
         List$Enumerator var22 = this.h0.iterator();

         try {
            while (var22.hasNext()) {
               q3v var24 = (q3v)var22.next();
               if (var24.t2() != 0.0) {
                  var24.a6(this.t9().k5.n5().n5(var24.t2()));
               }

               if (var24.s7() != 0.0) {
                  var24.u9(this.t9().k5.n5().n5(var24.s7()));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
               var22.dispose();
            }
         }
      }

      List$Enumerator var23 = this.a6.iterator();

      try {
         while (var23.hasNext()) {
            e1o var25 = (e1o)var23.next();
            var25.c8();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            var23.dispose();
         }
      }
   }

   private void c8() {
      this.t2();

      for (int var1 = 0; var1 < this.l6.size(); var1++) {
         this.l6.get_Item(var1).n5(com.aspose.slides.ms.System.q1.n5((double)(1.0 / this.n5(var1) * this.l6.get_Item(var1).n3()), 10));
         if (com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var1).n3())) {
            this.l6.get_Item(var1).n5(0.0);
         }
      }
   }

   private void t2() {
      boolean var1 = ChartTypeCharacterizer.isChartTypeColumn(this.e2().u9().getType()) || ChartTypeCharacterizer.isChartTypeBar(this.e2().u9().getType());

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         double var3 = 0.0;
         double var5 = 0.0;

         for (int var7 = 0; var7 < this.t9().n5.indexOf(this); var7++) {
            if (this.t9().n5.get_Item(var7).l6.size() - 1 >= var2) {
               h2v var8 = this.t9().n5.get_Item(var7).l6.get_Item(var2);
               if (var8.e2().n5() <= 0.0 && var1) {
                  var5 += var8.e2().n5();
               } else {
                  var3 += var8.e2().n5();
               }
            }
         }

         if (this.l6.get_Item(var2).e2().n5() < 0.0 && var1) {
            this.l6.get_Item(var2).n5(this.l6.get_Item(var2).n3() + var5);
         } else {
            this.l6.get_Item(var2).n5(this.l6.get_Item(var2).n3() + var3);
         }
      }
   }

   final double n5(int var1) {
      double var2 = 0.0;
      h2v[] var4 = this.t9().n5(var1);

      for (int var5 = 0; var5 < var4.length; var5++) {
         var2 += com.aspose.slides.ms.System.q1.n5(var4[var5].e2().n5());
      }

      if (var2 == 0.0) {
         var2 = 1.0;
      }

      return var2;
   }

   final double n5(int var1, int var2) {
      double var3 = 0.0;
      h2v[] var5 = this.t9().n5(var1);

      for (int var6 = 0; var6 <= var2; var6++) {
         var3 += com.aspose.slides.ms.System.q1.n5(var5[var6].e2().n5());
      }

      return var3;
   }

   protected final void u9(z5 var1) {
      List$Enumerator var2 = this.c8.iterator();

      try {
         while (var2.hasNext()) {
            b3u var3 = (b3u)var2.next();
            var3.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var12 = this.h0.iterator();

      try {
         while (var12.hasNext()) {
            q3v var4 = (q3v)var12.next();
            var4.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   protected final void x8() {
      List$Enumerator var1 = this.a6.iterator();

      try {
         while (var1.hasNext()) {
            e1o var2 = (e1o)var1.next();
            var2.t1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   protected final void n3() {
      List$Enumerator var1 = this.c8.iterator();

      try {
         while (var1.hasNext()) {
            b3u var2 = (b3u)var1.next();
            var2.e2();
            var2.t1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      List$Enumerator var11 = this.h0.iterator();

      try {
         while (var11.hasNext()) {
            q3v var3 = (q3v)var11.next();
            var3.e2();
            var3.t1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }
   }

   final void l6(double[] var1, double[] var2) {
      this.n5(var1, var2);
      this.a6(var1, var2);
      this.u9(var1, var2);
   }

   final void k5(double[] var1, double[] var2) {
      this.u3(var1, var2);
      this.c8(var1, var2);
      this.h0(var1, var2);
   }

   void n5(double[] var1, double[] var2) {
      var1[0] = this.l6.get_Item(0).n3();
      var2[0] = var1[0];
      if (this.l6.size() > 1) {
         for (int var3 = 1; var3 < this.l6.size(); var3++) {
            if (this.l6.get_Item(var3).e2().c8()) {
               if (!ChartTypeCharacterizer.c8(this.e2().u9().getType())) {
                  continue;
               }

               boolean var4 = false;
            } else {
               int var5 = com.aspose.slides.ms.System.d2.n5(this.l6.get_Item(var3).n3(), var2[0]);
            }

            if (this.l6.get_Item(var3).n3() > var2[0]) {
               var2[0] = this.l6.get_Item(var3).n3();
            }

            if (this.l6.get_Item(var3).n3() < var1[0]) {
               var1[0] = this.l6.get_Item(var3).n3();
            }
         }
      }
   }

   private void a6(double[] var1, double[] var2) {
      List$Enumerator var3 = this.c8.iterator();

      try {
         while (var3.hasNext()) {
            b3u var4 = (b3u)var3.next();
            if (var4.s7() > var2[0]) {
               var2[0] = var4.s7();
            }

            if (var4.t2() < var1[0]) {
               var1[0] = var4.t2();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void u9(double[] var1, double[] var2) {
      List$Enumerator var3 = this.a6.iterator();

      try {
         while (var3.hasNext()) {
            e1o var4 = (e1o)var3.next();
            var4.k5(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void h0(double[] var1, double[] var2) {
      List$Enumerator var3 = this.a6.iterator();

      try {
         while (var3.hasNext()) {
            e1o var4 = (e1o)var3.next();
            var4.l6(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   final void u3(double[] var1, double[] var2) {
      if (ChartTypeCharacterizer.isChartTypeBar(this.e2().u9().getType())) {
         this.n5(var1, var2);
      } else {
         var1[0] = this.l6.get_Item(0).y4();
         var2[0] = var1[0];
         if (this.l6.size() > 1) {
            for (int var3 = 1; var3 < this.l6.size(); var3++) {
               if (!this.l6.get_Item(var3).e2().c8()) {
                  if (this.l6.get_Item(var3).y4() > var2[0] || com.aspose.slides.ms.System.d2.k5(var2[0])) {
                     var2[0] = this.l6.get_Item(var3).y4();
                  }

                  if (this.l6.get_Item(var3).y4() < var1[0] || com.aspose.slides.ms.System.d2.k5(var1[0])) {
                     var1[0] = this.l6.get_Item(var3).y4();
                  }
               }
            }
         }
      }
   }

   private void c8(double[] var1, double[] var2) {
      if (ChartTypeCharacterizer.isChartTypeBar(this.e2().u9().getType())) {
         this.a6(var1, var2);
      } else {
         List$Enumerator var3 = this.h0.iterator();

         try {
            while (var3.hasNext()) {
               q3v var4 = (q3v)var3.next();
               if (var4.s7() > var2[0]) {
                  var2[0] = var4.s7();
               }

               if (var4.t2() < var1[0]) {
                  var1[0] = var4.t2();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   final boolean y4() {
      List$Enumerator var1 = this.l6.iterator();

      try {
         while (var1.hasNext()) {
            h2v var2 = (h2v)var1.next();
            if (!var2.e2().c8()) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   @Override
   void U_() {
      if (this.T_()) {
         for (v6g var4 : this.a0()) {
            var4.U_();
         }
      }
   }

   final g3y e2() {
      return this.n5;
   }

   final p7m t9() {
      return this.t2;
   }
}
