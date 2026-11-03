package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class d5t {
   private boolean n5;
   private Dictionary<IShape, Long> l6;
   private g6c k5;
   private g6o u3;

   public d5t(g6c var1, Dictionary<IShape, Long> var2) {
      this.l6 = var2;
      this.k5 = var1;
   }

   public d5t(Dictionary<IShape, Long> var1, g6o var2) {
      this.l6 = var1;
      this.u3 = var2;
   }

   final Dictionary<IShape, Long> n5() {
      return this.l6;
   }

   public final Dictionary<Long, k1z> l6() {
      return this.u3.r4();
   }

   final boolean n5(IShape var1) {
      Dictionary$KeyCollection$Enumerator var2 = this.n5().getKeys().iterator();

      try {
         while (var2.hasNext()) {
            IShape var3 = (IShape)var2.next();
            if (var3 == var1) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   final boolean n5(long var1) {
      Dictionary$KeyCollection$Enumerator var3 = this.n5().getKeys().iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            if (((Shape)var4).v4() == var1) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return false;
   }

   public final com.aspose.slides.internal.c8m.r7 n5(com.aspose.slides.internal.c8m.j8 var1) {
      if (this.k5 != null) {
         return this.k5.u6().l6(var1);
      } else {
         throw new NotImplementedException();
      }
   }

   public final com.aspose.slides.internal.c8m.r7 n5(String var1) {
      return this.k5 != null ? this.k5.u6().n5(var1, "NULL") : null;
   }

   final com.aspose.slides.internal.c8m.j8 n5(IAudio var1) {
      return this.k5 != null ? this.k5.n5(var1) : null;
   }

   final int l6(IAudio var1) {
      return this.u3 != null ? e0j.n5(var1, this.u3) : 0;
   }

   final int l6(String var1) {
      if (this.u3 != null && this.k5 != null) {
         com.aspose.slides.internal.c8m.j8 var2 = this.k5.u6().n5(var1).l6();
         if (var2 != null) {
            IAudio var3 = this.k5.n5(var2);
            if (var3 != null) {
               return e0j.n5(var3, this.u3);
            }
         }
      }

      return 0;
   }

   final boolean k5() {
      return this.n5;
   }

   final void n5(boolean var1) {
      this.n5 = var1;
   }

   final void n5(String var1, int var2) {
      if (this.u3 == null) {
         throw new InvalidOperationException();
      }

      this.u3.n5(var1, var2);
   }
}
