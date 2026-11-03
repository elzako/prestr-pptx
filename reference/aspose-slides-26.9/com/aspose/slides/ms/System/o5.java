package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.InvalidOperationException;

@j3
public class o5<T> extends com.aspose.slides.internal.v6g.h0<o5<T>> {
   private T n5;
   private boolean l6;

   public final T n5() {
      if (!this.l6) {
         throw new InvalidOperationException("Nullable object must have a value.");
      } else {
         return this.n5;
      }
   }

   public final boolean l6() {
      return this.l6;
   }

   public o5() {
   }

   public o5(T var1) {
      if (var1 == null) {
         throw new InvalidOperationException("Nullable object must have a value.");
      }

      this.n5 = (T)var1;
      this.l6 = true;
   }

   public final T n5(Class<?> var1) {
      return (T)(this.l6() ? this.n5 : com.aspose.slides.internal.v6g.k5.k5(var1));
   }

   public final T n5(T var1) {
      return (T)(this.l6() ? this.n5 : var1);
   }

   @Override
   public boolean equals(Object other) {
      boolean var2 = other == null || other instanceof o5 && !((o5)other).l6();
      if (!this.l6) {
         return var2;
      } else if (var2) {
         return false;
      } else {
         return other instanceof o5 ? this.n5.equals(((o5)other).n5) : this.n5.equals(other);
      }
   }

   @Override
   public int hashCode() {
      return !this.l6 ? 0 : this.n5.hashCode();
   }

   @Override
   public String toString() {
      return !this.l6 ? "" : this.n5.toString();
   }

   public void n5(o5<T> var1) {
      var1 = var1 == null ? new o5() : var1;
      var1.l6 = this.l6;
      var1.n5 = this.n5;
   }

   public o5<T> k5() {
      o5 var1 = new o5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   public static boolean n5(o5 var0, o5 var1) {
      if (var0 != null && var1 != null) {
         if (!var0.l6 && !var1.l6) {
            return true;
         } else {
            return (!var0.l6 || var1.l6) && (var0.l6 || !var1.l6) ? var0.n5.equals(var1.n5) : false;
         }
      } else if (var0 == null && var1 == null) {
         return true;
      } else {
         return var0 == null ? !var1.l6 : !var0.l6;
      }
   }

   public static boolean l6(o5 var0, o5 var1) {
      return !n5(var0, var1);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public o5<T> Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(o5<T> bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
