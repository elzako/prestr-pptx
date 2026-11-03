package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class k6j implements IDisposable {
   private final LoadOptions n5;
   private final s9c l6;
   private final o3h k5;
   private FontFallBackRulesCollection u3 = null;
   private b1g a6 = null;
   private b1g u9 = null;
   private n9a h0 = null;
   private n9a c8 = null;
   private String t2;

   public k6j(LoadOptions var1) {
      this.n5 = var1;
      this.l6 = new s9c(var1.getDocumentLevelFontSources());
      this.k5 = new o3h();
      this.a6 = new b1g(this.k5);
      this.c8 = new n9a(this.k5);
      this.h0 = new n9a(this.k5);
   }

   public final e6s n5() {
      return this.l6.n5();
   }

   public final IFontFallBackRulesCollection l6() {
      if (this.u3 == null) {
         this.n5(new FontFallBackRulesCollection());
      }

      return this.u3;
   }

   public final void n5(IFontFallBackRulesCollection var1) {
      if (this.u3 != var1) {
         this.n5((FontFallBackRulesCollection)var1);
      }
   }

   final String k5() {
      return this.t2;
   }

   final void n5(String var1) {
      this.t2 = var1;
   }

   final String[] n5(int var1, byte[] var2, boolean var3) {
      y1i[] var4 = this.n5(var1, this.n5(var2, var3));
      int var5 = var4 != null ? var4.length : 0;
      if (var5 == 0) {
         return null;
      }

      List var6 = new List(var5 + 1);
      var6.addRange(com.aspose.slides.ms.System.u3.n5(var4));
      String[] var7 = new String[var6.size()];
      int var8 = 0;
      List$Enumerator var9 = var6.iterator();

      try {
         while (var9.hasNext()) {
            y1i var10 = (y1i)var9.next();
            var7[var8] = var10.n5();
            var8++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      return var7;
   }

   private b1g n5(byte[] var1, boolean var2) {
      o3h var3 = new o3h();
      b1g var4 = new b1g(var3);
      if (var2) {
         var4.n5(3584L, 3711L, "Angsana New");
      }

      if (var1 == null) {
         return var4;
      }

      w2w var5 = new w2w(var1);
      if (var5.u3() == 9 || var5.x8()) {
         var4.n5(8352L, 8399L, "Courier New");
      }

      if (var5.x8()) {
         var4.n5(880L, 1023L, "Courier New");
         var4.n5(8448L, 8527L, "Courier New");
         var4.n5(8704L, 8959L, "Courier New");
         var4.n5(181L, 181L, "Courier New");
      }

      return var4;
   }

   private void n5(FontFallBackRulesCollection var1) {
      if (this.u3 != null) {
         this.u3.n5(null);
      }

      this.u3 = var1;
      this.u3();
      if (this.u3 != null) {
         this.u3.n5(new k6j$1(this));
      }
   }

   final void u3() {
      if (this.u9 != null) {
         this.u9.n5();
         this.u9 = null;
      }
   }

   public final c4y n5(byte[] var1, byte[] var2, String var3, byte var4, byte[] var5, byte var6, int var7, boolean var8) {
      c4y var9 = this.n5().n5(var3);
      if (var9 != null && var9.h0().getKeys().containsItem(var7)) {
         return var9;
      }

      this.l6.a6();
      return this.n5().n5(var3, var4, var5, var6 & 255, var7, var1, var2, var8, this.n5);
   }

   public final boolean a6() {
      return this.l6.n5().n5() > 0;
   }

   final c4y l6(String var1) {
      return !this.a6() ? null : this.n5().n5(var1);
   }

   public final com.aspose.slides.internal.o9b.n3 n5(String var1, float var2, int var3) {
      return this.l6.n5(var1, var2, var3);
   }

   final b1g u9() {
      if (this.u9 == null) {
         this.t2();
      }

      return this.u9;
   }

   private void t2() {
      this.u9 = new b1g(this.k5);
      if (this.u3 != null) {
         IGenericEnumerator var1 = this.u3.iterator();

         try {
            while (var1.hasNext()) {
               IFontFallBackRule var2 = (IFontFallBackRule)var1.next();
               FontFallBackRule var3 = (FontFallBackRule)var2;
               com.aspose.slides.ms.System.t4.l6(
                  com.aspose.slides.ms.System.d1.n5(
                     "... Rule: 0x",
                     com.aspose.slides.ms.System.l4.n5(var3.getRangeStartIndex(), "X2"),
                     "-",
                     com.aspose.slides.ms.System.l4.n5(var3.getRangeEndIndex(), "X2")
                  )
               );
               FontFallBackRule var4 = new FontFallBackRule(var3.getRangeStartIndex(), var3.getRangeEndIndex());
               var4.n5().addRange(var3.n5());
               this.u9.n5(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }
   }

   final String[] n5(int var1, String var2, byte[] var3) {
      w2w var4 = new w2w(var3);
      y1i[] var5 = this.n5(var1, this.u9());
      y1i[] var6 = this.n5(var1, this.a6);
      int var7 = var5 != null ? var5.length : 0;
      int var8 = var7;
      var7 += var6 != null ? var6.length : 0;
      List var9 = new List(var7 + 1);
      if (var5 != null) {
         var9.addRange(com.aspose.slides.ms.System.u3.n5(var5));
      }

      if (var6 != null) {
         if (var8 > 0) {
            for (y1i var13 : var6) {
               int var14 = 0;

               while (var14 < var8 && var9.get_Item(var14) != var13) {
                  var14++;
               }

               var9.addItem(var13);
            }
         } else {
            var9.addRange(com.aspose.slides.ms.System.u3.n5(var6));
         }
      }

      if (var9 != null && var9.size() > 0) {
         this.n5(var9, var2, var4);
      }

      String[] var19 = new String[var9.size()];
      int var20 = 0;
      List$Enumerator var21 = var9.iterator();

      try {
         while (var21.hasNext()) {
            y1i var22 = (y1i)var21.next();
            var19[var20] = var22.n5();
            var20++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      return var19;
   }

   private y1i[] n5(int var1, b1g var2) {
      if (var2.l6() < 1) {
         return null;
      }

      FontFallBackRule var3 = (FontFallBackRule)var2.n5(var1 & 4294967295L);
      return var3 == null ? null : var3.n5().toArray(new y1i[0]);
   }

   private void n5(List<y1i> var1, String var2, w2w var3) {
      t1n var4 = this.c8.n5(var2);
      t1n var5 = this.n5(this.h0, var2, var3);
      List var6 = null;
      if (var4 != null) {
         var6 = new List<>(var4.l6());
      }

      if (var5 != null) {
         if (var6 != null) {
            int var7 = var6.size();
            if (var7 > 0) {
               List$Enumerator var8 = var5.l6().iterator();

               try {
                  while (var8.hasNext()) {
                     y1i var9 = (y1i)var8.next();
                     int var10 = 0;

                     while (var10 < var7 && var9 != var6.get_Item(var10)) {
                        var10++;
                     }

                     if (var10 >= var7) {
                        var6.addItem(var9);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }
            } else {
               var6.addRange(var5.l6());
            }
         } else {
            var6 = new List<>(var5.l6());
         }
      }

      if (var6 != null && var6.size() != 0) {
         int var19 = 0;
         List$Enumerator var20 = var6.iterator();

         try {
            while (var20.hasNext()) {
               y1i var21 = (y1i)var20.next();

               for (int var22 = var19; var22 < var1.size(); var22++) {
                  if (var21 == var1.get_Item(var22)) {
                     if (var22 > var19) {
                        var1.removeAt(var22);
                        var1.insertItem(var19, var21);
                     }

                     var19++;
                     break;
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }
      }
   }

   private t1n n5(n9a var1, String var2, w2w var3) {
      y1i var4 = this.k5.n5(var2);
      t1n var5 = var1.n5(var4);
      if (var5 != null) {
         return var5;
      }

      if (var3.x8()) {
         return null;
      }

      List var6 = this.k5.n5(var3, var2);
      List$Enumerator var7 = var6.iterator();

      try {
         while (var7.hasNext()) {
            y1i var8 = (y1i)var7.next();
            if (var5 == null) {
               var5 = new t1n(var4, var8);
            } else {
               var5.n5(var8, false);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      var1.n5(var5);
      return var5;
   }

   @Override
   public final void dispose() {
      this.l6.dispose();
   }

   public final e4z n5(String var1, byte var2, int var3, float var4, int var5, boolean var6) {
      return this.n5(var1, var2, var3, var4, var5, var6, false);
   }

   public final e4z n5(String var1, byte var2, int var3, float var4, int var5, boolean var6, boolean var7) {
      return this.l6.n5(var1, var2, var3, var4, var5, var6, var7);
   }

   public final void h0() {
      this.l6.k5();
   }

   public final void c8() {
      this.l6.u3();
   }
}
