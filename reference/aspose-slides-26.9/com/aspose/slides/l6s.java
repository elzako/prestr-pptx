package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class l6s extends p6x {
   private final List<l6s> n5 = new List<>();

   public final l6s n5() {
      return (l6s)super.n3();
   }

   public final List<l6s> l6() {
      return this.n5;
   }

   public final String k5() {
      return this.y4().n5() != null ? this.y4().n5().t2() : com.aspose.slides.ms.System.d1.n5;
   }

   public final int u3() {
      if (this.n5() == null) {
         return 1;
      }

      int var1 = 0;

      for (int var2 = 0; var2 < this.n5().l6().size(); var2++) {
         l6s var3 = this.n5().l6().get_Item(var2);
         if (var3.e2() == this.e2()) {
            var1++;
         }

         if (var3 == this) {
            return var1;
         }
      }

      throw new InvalidOperationException("Invalid state of node. Node are not attached to parent");
   }

   public final int a6() {
      if (this.n5() == null) {
         return 1;
      }

      int var1 = 0;

      for (int var2 = this.n5().l6().size() - 1; var2 >= 0; var2--) {
         l6s var3 = this.n5().l6().get_Item(var2);
         if (var3.e2() == this.e2()) {
            var1++;
         }

         if (var3 == this) {
            return var1;
         }
      }

      throw new InvalidOperationException("Invalid state of node. Node are not attached to parent");
   }

   public final boolean u9() {
      if (this.n5() == null) {
         return true;
      } else {
         return this.n5().l6().size() == 0 ? false : this.n5().l6().get_Item(this.n5().l6().size() - 1) == this;
      }
   }

   public final l6s h0() {
      return (l6s)super.q0();
   }

   public final l6s c8() {
      return (l6s)super.z3();
   }

   public l6s(l6s var1, SmartArtNode var2) {
      super(var1, var2.n5());
      IGenericEnumerator var3 = var2.getChildNodes().iterator();

      try {
         while (var3.hasNext()) {
            SmartArtNode var4 = (SmartArtNode)var3.next();
            this.n5.addItem(new l6s(this, var4.l6()));
            this.n5.addItem(new l6s(this, var4));
            this.n5.addItem(new l6s(this, var4.k5()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private l6s(l6s var1, w4c var2) {
      super(var1, var2);
   }

   public final boolean n5(int var1, int var2) {
      switch (var2) {
         case 1:
            return true;
         case 2:
            return var1 == 3;
         case 3:
            return var1 == 1 || var1 == 2;
         case 4:
         case 5:
         default:
            return false;
         case 6:
            return var1 == 2;
         case 7:
            return var1 == 1;
         case 8:
            return var1 == 5;
         case 9:
            return var1 == 4;
         case 10:
            return var1 == 6;
      }
   }

   public final l6s t2() {
      if (this.e2() == 3) {
         return this;
      } else if (this.e2() == 5) {
         return this.n5();
      } else {
         return this.e2() == 6 ? this.h0() : null;
      }
   }

   public final l6s s7() {
      if (this.e2() == 3) {
         return this;
      }

      if (this.e2() == 5) {
         return this.c8();
      }

      if (this.e2() == 6 && this.n5() != null) {
         for (int var1 = 0; var1 < this.n5().l6().size(); var1++) {
            if (var1 != this.n5().l6().size() - 1 && this.n5().l6().get_Item(var1) == this) {
               if (this.n5().l6().size() > var1 + 2) {
                  return this.n5().l6().get_Item(var1 + 2);
               }
               break;
            }
         }
      }

      return null;
   }

   @Override
   protected List<p6x> x8() {
      List var1 = new List(this.n5.size());
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            l6s var3 = (l6s)var2.next();
            var1.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final List<l6s> n5(z5z var1, boolean var2) {
      return this.n5(var1, var2, 0, true);
   }

   public final List<l6s> n5(z5z var1, boolean var2, int var3, boolean var4) {
      if (var1.n5().size() == 0) {
         return new List<>();
      }

      int var5 = var1.k5().size() > 0 && var3 < var1.k5().size() ? var1.k5().get_Item(var3) : 1;
      if (var5 == 0) {
         var5 = 1;
      }

      int var6 = var1.l6().size() > var3 ? var1.l6().get_Item(var3) : Integer.MAX_VALUE;
      if (var6 == 0) {
         var6 = Integer.MAX_VALUE;
      }

      int var7 = var1.u3().size() > var3 ? var1.u3().get_Item(var3) : 1;
      int var8 = var1.a6().size() > var3 ? var1.a6().get_Item(var3) : 1;
      boolean var9 = var1.u9().size() > var3 ? var1.u9().get_Item(var3) && var2 : var2;
      List var10 = this.n5(var1.n5().get_Item(var3), var5, var6, var7, var8, var9);
      if (var3 + 1 != var1.n5().size() && var4) {
         List var11 = new List();
         List$Enumerator var12 = var10.iterator();

         try {
            while (var12.hasNext()) {
               l6s var13 = (l6s)var12.next();
               var11.addRange(var13.n5(var1, var2, var3 + 1, var4));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
               var12.dispose();
            }
         }

         return var11;
      } else {
         return var10;
      }
   }

   private List<l6s> n5(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      List var7 = new List();
      switch (var1) {
         case 0:
         default:
            break;
         case 1:
            this.n5(var7, var2);
            break;
         case 2:
            this.l6(var7, var2);
            break;
         case 3:
            this.k5(var7, var2);
            break;
         case 4:
            this.n5(var7, var2, var6);
            break;
         case 5:
            this.l6(var7, var2, var6);
            break;
         case 6:
            this.k5(var7, var2, var6);
            break;
         case 7:
            this.u3(var7, var2, var6);
            break;
         case 8:
            this.u3(var7, var2);
            break;
         case 9:
            this.a6(var7, var2, var6);
            break;
         case 10:
            this.a6(var7, var2);
            break;
         case 11:
            this.u9(var7, var2);
            break;
         case 12:
            this.u9(var7, var2, var6);
      }

      if (var3 == 0 && var4 == 1 && var5 == 1) {
         return var7;
      }

      List var8 = new List();
      if (var3 == Integer.MAX_VALUE) {
         var3 = var7.size();
      }

      if (var5 == 0) {
         var5 = 1;
      }

      if (var1 != 9 && var1 != 10 && var5 >= 0 && var4 >= 0) {
         if (var5 <= 0) {
            var5 = 1;
         }

         if (var4 <= 0) {
            var4 = 1;
         }

         var3 += var4 - 1;

         for (int var12 = var4 - 1; var12 < var7.size() && var12 < var3; var12 += var5) {
            if (var12 < var7.size()) {
               var8.addItem(var7.get_Item(var12));
            }
         }
      } else {
         if (var5 < 0) {
            var5 = -var5;
         }

         if (var4 < 0) {
            var4 = -var4;
         }

         int var9 = 0;

         for (int var10 = var7.size() - 1 - (var4 - 1); var10 >= 0 && var9 < var3; var10 -= var5) {
            if (var10 < var7.size()) {
               var8.addItem(var7.get_Item(var10));
               var9++;
            }
         }
      }

      return var8;
   }

   private void n5(List<l6s> var1, int var2) {
      for (l6s var3 = this.n5(); var3 != null; var3 = this.n5()) {
         if (this.n5(var3.e2(), var2)) {
            var1.addItem(var3);
         }
      }
   }

   private void l6(List<l6s> var1, int var2) {
      if (this.n5(this.e2(), var2)) {
         var1.addItem(this);
         this.n5(var1, var2);
      }
   }

   private void k5(List<l6s> var1, int var2) {
      List$Enumerator var3 = this.l6().iterator();

      try {
         while (var3.hasNext()) {
            l6s var4 = (l6s)var3.next();
            if (this.n5(var4.e2(), var2)) {
               var1.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void n5(List<l6s> var1, int var2, boolean var3) {
      for (int var4 = 0; var4 < this.l6().size(); var4++) {
         l6s var5 = this.l6().get_Item(var4);
         if (this.n5(var5, var2, var4, this.l6().size(), var3)) {
            var1.addItem(var5);
         }

         var5.n5(var1, var2, var3);
      }
   }

   private void l6(List<l6s> var1, int var2, boolean var3) {
      if (this.n5(this.e2(), var2)) {
         var1.addItem(this);
      }

      this.n5(var1, var2, var3);
   }

   private void k5(List<l6s> var1, int var2, boolean var3) {
      if (this.n5() != null) {
         boolean var4 = false;
         List$Enumerator var5 = this.n5().l6().iterator();

         try {
            while (var5.hasNext()) {
               l6s var6 = (l6s)var5.next();
               if (var4) {
                  var6.l6(var1, var2, var3);
               } else if (var6 == this) {
                  var4 = true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }
   }

   private void u3(List<l6s> var1, int var2, boolean var3) {
      if (this.n5() != null) {
         boolean var4 = false;

         for (int var5 = 0; var5 < this.n5().l6().size(); var5++) {
            l6s var6 = this.n5().l6().get_Item(var5);
            if (var4) {
               if (this.n5(var6, var2, var5, this.n5().l6().size(), var3)) {
                  var1.addItem(var6);
               }
            } else if (var6 == this) {
               var4 = true;
            }
         }
      }
   }

   private void u3(List<l6s> var1, int var2) {
      if (this.n5() != null && this.n5(this.n5().e2(), var2)) {
         var1.addItem(this.n5());
      }
   }

   private void a6(List<l6s> var1, int var2, boolean var3) {
      if (this.n5() != null) {
         List$Enumerator var4 = this.n5().l6().iterator();

         try {
            while (var4.hasNext()) {
               l6s var5 = (l6s)var4.next();
               if (var5 == this) {
                  break;
               }

               var5.l6(var1, var2, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }
   }

   private void a6(List<l6s> var1, int var2) {
      if (this.n5() != null) {
         List$Enumerator var3 = this.n5().l6().iterator();

         try {
            while (var3.hasNext()) {
               l6s var4 = (l6s)var3.next();
               if (var4 == this) {
                  break;
               }

               if (this.n5(var4.e2(), var2)) {
                  var1.addItem(var4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   private void u9(List<l6s> var1, int var2) {
      l6s var3 = this;

      while (var3.n5() != null) {
         var3 = var3.n5();
      }

      if (this.n5(var3.e2(), var2)) {
         var1.addItem(var3);
      }
   }

   private void u9(List<l6s> var1, int var2, boolean var3) {
      if (this.n5(this.e2(), var2)) {
         var1.addItem(this);
      }
   }

   private boolean n5(l6s var1, int var2, int var3, int var4, boolean var5) {
      boolean var6 = var3 == var4 - 1 && var1.e2() == 6;
      return this.n5(var1.e2(), var2) && (!var5 || !var6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public l6s n3() {
      return this.n5();
   }

}
