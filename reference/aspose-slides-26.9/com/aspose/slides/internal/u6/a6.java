package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p3.s3;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class a6 {
   private List<c8> n5 = new List<>();
   private int l6;
   private int k5;
   private com.aspose.slides.internal.v8.u9 u3;
   private com.aspose.slides.internal.v8.u9 a6;

   public a6(int var1, int var2, List<c8> var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.n5 = var3;
      List$Enumerator var4 = var3.iterator();

      try {
         while (var4.hasNext()) {
            Object var5 = var4.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, y4.class)) {
               ((y4)var5).u9(var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   public final int n5() {
      return this.l6;
   }

   public final int l6() {
      return this.k5;
   }

   public final y1 k5() {
      return this.n5(0).h0();
   }

   public final com.aspose.slides.internal.v8.u9 u3() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.v8.u9 var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.v8.u9 a6() {
      return this.a6;
   }

   public final void l6(com.aspose.slides.internal.v8.u9 var1) {
      this.a6 = var1;
   }

   public final List<c8> u9() {
      return this.n5;
   }

   public final c8 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final boolean l6(int var1) {
      if (var1 == 0) {
         return this.n5(0).k5(0);
      } else if (var1 == 1) {
         return this.n5(0).k5(1);
      } else {
         throw new ArgumentException(d1.n5(new String[]{"Illegal flag queried: ", a3.l6(var1)}));
      }
   }

   public final s3 h0() {
      s3 var1 = s3.n5;
      y1 var2 = this.k5();
      if (var2 != null) {
         var1 = s3.n5(var2.o0());
      }

      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            c8 var4 = (c8)var3.next();
            if (var4.k5()) {
               var1 = var1.n5(var4.l6().j5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   public final s3 c8() {
      s3 var1 = s3.n5;
      y1 var2 = this.k5();
      if (var2 != null) {
         var1 = s3.n5(var2.z7());
      }

      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            c8 var4 = (c8)var3.next();
            if (!var4.c8() && var4.s7() == 0 && var4.a6()) {
               var1 = var1.n5(var4.l6().w1());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   public final s3 t2() {
      y1 var1 = this.k5();
      s3 var2 = s3.n5;
      if (var1 != null) {
         var2 = s3.n5(var1.v4());
      }

      return var2;
   }

   public final int s7() {
      int var1 = 9;
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            c8 var3 = (c8)var2.next();
            if (var3.k5()) {
               var1 = com.aspose.slides.internal.v3.n5.n5(var1, var3.l6().r4());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final int x8() {
      int var1 = 9;
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            c8 var3 = (c8)var2.next();
            if (!var3.c8() && var3.s7() == 0 && var3.a6()) {
               var1 = com.aspose.slides.internal.v3.n5.n5(var1, var3.l6().c4());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      a5 var1 = new a5("EffRow {");
      var1.k5(this.l6);
      if (this.l6() == 0) {
         var1.n5(" in body");
      } else if (this.l6() == 1) {
         var1.n5(" in header");
      } else {
         var1.n5(" in footer");
      }

      var1.n5(", ").n5(this.u3);
      var1.n5(", ").n5(this.a6);
      var1.n5(", ").k5(this.n5.size()).n5(" gu");
      var1.n5("}");
      return var1.toString();
   }
}
