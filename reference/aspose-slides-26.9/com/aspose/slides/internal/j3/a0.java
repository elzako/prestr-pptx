package com.aspose.slides.internal.j3;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.d1;

public class a0<T extends z8> implements m3 {
   private List<T> n5;
   private final short l6;

   public a0(short var1) {
      this.l6 = var1;
      this.n5 = new List<>();
   }

   private int n5(String var1) {
      int var2 = this.n5();

      for (int var3 = 0; var3 < var2; var3++) {
         z8 var4 = this.n5.get_Item(var3);
         if (d1.u3(var4.h0(), var1, this.l6)) {
            return var3;
         }
      }

      return -1;
   }

   private int n5(String var1, String var2) {
      int var3 = this.n5();

      for (int var4 = 0; var4 < var3; var4++) {
         z8 var5 = this.n5.get_Item(var4);
         if (d1.u3(var5.t2(), var1, this.l6) && ("*".equals(var2) || d1.u3(var5.s7(), var2, this.l6))) {
            return var4;
         }
      }

      return -1;
   }

   public final T a6(T var1) {
      this.n5.addItem((T)var1);
      this.l6((T)var1);
      return (T)var1;
   }

   protected final T l6(int var1) {
      z8 var2 = this.n5.get_Item(var1);
      this.n5.removeAt(var1);
      this.n5((T)var2);
      return (T)var2;
   }

   private T n5(int var1, T var2) {
      z8 var3 = this.l6(var1);
      this.l6(var1, (T)var2);
      this.l6((T)var2);
      return (T)var3;
   }

   private T l6(int var1, T var2) {
      this.n5.insertItem(var1, (T)var2);
      this.l6((T)var2);
      return (T)var2;
   }

   protected void l6(z8 var1) {
   }

   protected void n5(z8 var1) {
   }

   @Override
   public final int n5() {
      return this.n5 != null ? this.n5.size() : 0;
   }

   @Override
   public final z8 u3(String var1) {
      int var2 = this.n5(var1);
      return var2 >= 0 ? this.n5.get_Item(var2) : null;
   }

   @Override
   public final z8 k5(z8 var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2 = this.n5(var1.h0());
         if (var2 == -1) {
            this.a6((T)var1);
            return null;
         } else {
            return this.n5(var2, (T)var1);
         }
      }
   }

   @Override
   public final z8 a6(String var1) {
      int var2 = this.n5(var1);
      return var2 >= 0 ? this.l6(var2) : null;
   }

   @Override
   public final z8 n5(int var1) {
      return var1 >= 0 && var1 < this.n5.size() ? this.n5.get_Item(var1) : null;
   }

   @Override
   public final z8 k5(String var1, String var2) {
      int var3 = this.n5(var2, var1);
      return var3 >= 0 ? this.n5.get_Item(var3) : null;
   }

   @Override
   public final z8 u3(z8 var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2 = this.n5(var1.t2(), var1.s7());
         if (var2 == -1) {
            this.a6((T)var1);
            return null;
         } else {
            return this.n5(var2, (T)var1);
         }
      }
   }

   @Override
   public final z8 u3(String var1, String var2) {
      int var3 = this.n5(var2, var1);
      return var3 >= 0 ? this.l6(var3) : null;
   }

   @Override
   public final IEnumerator iterator() {
      return this.n5.iterator();
   }
}
