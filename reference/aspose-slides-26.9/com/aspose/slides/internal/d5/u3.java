package com.aspose.slides.internal.d5;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.e5.t2;
import com.aspose.slides.internal.e5.t9;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v8.s7;
import com.aspose.slides.internal.v8.y4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class u3 {
   private t2 n5;
   private a5 l6;
   private List<u9> k5;

   public u3(t2 var1) {
      this.n5 = var1;
      this.l6 = new a5();
      this.k5 = new List<>();
   }

   public final t2 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.e5.k5 var1, t2 var2) {
      if (var1 != null) {
         int var3 = this.l6.l6();

         int var4;
         for (var4 = var3; var1.l6(); var4++) {
            char var5 = var1.u3();
            this.l6.n5(var5);
         }

         this.k5.addItem(new u9(var2, var3, var4));
      }
   }

   public final void n5(char var1, t2 var2) {
      if (var1 != 0) {
         int var3 = this.l6.l6();
         int var4 = var3 + 1;
         this.l6.n5(var1);
         this.k5.addItem(new u9(var2, var3, var4));
      }
   }

   public final boolean l6() {
      return this.l6.l6() == 0;
   }

   public final void k5() {
      com.aspose.slides.internal.v8.u3 var1;
      if ((var1 = y4.n5(this.k5.get_Item(0).n5())) != null) {
         this.n5(var1.j9(), var1.z6());
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5(d1.n5("DR: ", this.n5.z1(), " { <", com.aspose.slides.internal.v3.l6.n5(this.l6.toString()), ">"));
      var1.n5(", intervals <");
      boolean var2 = true;
      List$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            u9 var4 = (u9)var3.next();
            if (var2) {
               var2 = false;
            } else {
               var1.n5(',');
            }

            var1.n5(var4.toString());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var1.n5("> }");
      return var1.toString();
   }

   private void n5(com.aspose.slides.internal.v8.k5 var1, s7 var2) {
      int[] var3;
      if ((var3 = c8.n5(new com.aspose.slides.internal.r4.l6(d1.c8(this.l6.toString())), var1, this.k5)) != null) {
         if (var2 == s7.k5) {
            for (int var4 = 0; var4 < var3.length; var4++) {
               var3[var4]++;
            }
         }

         this.n5(var3);
         this.n5(var1);
         this.u3();
      }
   }

   private void n5(int[] var1) {
      List var2 = new List(this.k5.size());
      List$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            u9 var4 = (u9)var3.next();
            var2.addRange(n5(var4, var1));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (!var2.equals(this.k5)) {
         this.k5 = var2;
      }
   }

   private static List<u9> n5(u9 var0, int[] var1) {
      List var2 = new List();
      t2 var3 = var0.n5();
      int var4 = var0.l6();
      int var5 = var4;
      int var6 = var0.k5();

      while (var5 < var6) {
         int var7 = var5;
         int var8 = var7;
         int var9 = var1[var7];

         while (var8 < var6 && var1[var8] == var9) {
            var8++;
         }

         if (var0.l6() == var7 && var0.k5() == var8) {
            var0.n5(var9);
         } else {
            var0 = new u9(var3, var4, var7, var8, var9);
         }

         var2.addItem(var0);
         var5 = var8;
      }

      return var2;
   }

   private void u3() {
      List$Enumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            u9 var2 = (u9)var1.next();
            var2.u3();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.v8.k5 var1) {
      int var2 = var1 == com.aspose.slides.internal.v8.k5.l6 ? 1 : 0;
      List$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            u9 var4 = (u9)var3.next();
            n5(var4.n5(), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private static void n5(t2 var0, int var1) {
      for (t2 var2 = var0; var2 != null; var2 = var2.s_()) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2, t9.class)) {
            t9 var3 = (t9)var2;
            if (var3.m3()) {
               if (var3.d2() < 0) {
                  var3.u3(var1);
               }
               break;
            }
         }
      }
   }
}
