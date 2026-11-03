package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class z5z {
   private List<Integer> n5;
   private List<Integer> l6;
   private List<Integer> k5;
   private List<Integer> u3;
   private List<Integer> a6;
   private List<Boolean> u9;
   private static final com.aspose.slides.internal.n8e.e2 h0 = new com.aspose.slides.internal.n8e.e2(
      "none", "ancst", "ancstOrSelf", "ch", "des", "desOrSelf", "follow", "followSib", "par", "preced", "precedSib", "root", "self"
   );

   public final List<Integer> n5() {
      return this.n5;
   }

   public final List<Integer> l6() {
      return this.l6;
   }

   public final List<Integer> k5() {
      return this.k5;
   }

   public final List<Integer> u3() {
      return this.u3;
   }

   public final List<Integer> a6() {
      return this.a6;
   }

   public final List<Boolean> u9() {
      return this.u9;
   }

   public z5z(com.aspose.slides.internal.k4y.k3i var1) {
      this.k5 = l6(var1.l6());
      this.n5 = n5(var1.n5());
      this.l6 = k5(var1.a6());
      this.u3 = k5(var1.u3());
      this.a6 = k5(var1.u9());
      this.u9 = u3(var1.k5());
   }

   public z5z(com.aspose.slides.internal.k4y.d4w var1) {
      this.k5 = l6(var1.l6());
      this.n5 = n5(var1.n5());
      this.l6 = k5(var1.a6());
      this.u3 = k5(var1.u3());
      this.a6 = k5(var1.u9());
      this.u9 = u3(var1.k5());
   }

   public z5z(com.aspose.slides.internal.k4y.c5z var1) {
      this.k5 = l6(var1.u3());
      this.n5 = n5(var1.k5());
      this.l6 = k5(var1.h0());
      this.u3 = k5(var1.u9());
      this.a6 = k5(var1.c8());
      this.u9 = u3(var1.a6());
   }

   private static List<Integer> n5(String var0) {
      List var1 = new List();
      var1.clear();
      String[] var2 = com.aspose.slides.ms.System.d1.u9(var0, ' ');

      for (String var6 : var2) {
         if (var6.length() != 0) {
            var1.addItem(h0.n5(var6));
         }
      }

      return var1;
   }

   private static List<Integer> l6(String var0) {
      List var1 = new List();
      String[] var2 = com.aspose.slides.ms.System.d1.n5(var0, ' ');

      for (String var6 : var2) {
         if (var6.length() != 0) {
            var1.addItem(com.aspose.slides.internal.k4y.t2e.n5(var6));
         }
      }

      return var1;
   }

   private static List<Integer> k5(String var0) {
      List var1 = new List();
      String[] var2 = com.aspose.slides.ms.System.d1.n5(var0, ' ');

      for (String var6 : var2) {
         if (var6.length() != 0) {
            var1.addItem(com.aspose.slides.ms.System.a3.n5(var6));
         }
      }

      return var1;
   }

   private static List<Boolean> u3(String var0) {
      List var1 = new List();
      String[] var2 = com.aspose.slides.ms.System.d1.n5(var0, ' ');

      for (String var6 : var2) {
         if (var6.length() != 0) {
            boolean var7 = true;
            if ("false".equals(var6) || "0".equals(var6) || "False".equals(var6) || "f".equals(var6)) {
               var7 = false;
            }

            var1.addItem(var7);
         }
      }

      return var1;
   }
}
