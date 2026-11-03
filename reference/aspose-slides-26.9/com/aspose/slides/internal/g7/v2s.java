package com.aspose.slides.internal.g7;

import java.util.Map;
import java.util.TreeMap;

public abstract class v2s extends f1s {
   protected Map<r9, Integer> l6;
   protected int k5;
   private boolean a6;
   protected String u3;
   private v2s$l6 u9;
   private v2s$k5 h0;

   public v2s(long var1, long var3, String var5) {
      super(var1, var3);
      this.n5(var5);
   }

   public v2s(long var1, String var3) {
      super(var1);
      this.n5(var3);
   }

   public final boolean l6() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   private void n5(String var1) {
      this.u3 = var1;
      this.l6 = new TreeMap<>(new v2s$n5(this.u3));
      this.n5(false);
   }

   protected final void n5(r9 var1, int var2) {
      try {
         this.l6.put(var1, var2);
      } catch (IllegalArgumentException var4) {
         if (!this.l6()) {
            throw new q9u(var1, this.u3, var4);
         }
      }
   }

   protected final int n5(r9 var1) {
      try {
         return this.l6.get(var1);
      } catch (NullPointerException var3) {
         return -1;
      }
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      this.k5 = var1.n3() & 65535;
      if (this.k5 == 1) {
         if (this.k5() != null) {
            this.k5().n5(var1);
         }
      } else {
         if (this.k5 != 2) {
            com.aspose.slides.internal.f8y.n5.n5("Incorrect format number({0}) for table of type {1}", this.k5, this.u3);
            return;
         }

         if (this.u3() != null) {
            this.u3().n5(var1);
         }
      }
   }

   public final v2s$l6 k5() {
      return this.u9;
   }

   public final void n5(v2s$l6 var1) {
      this.u9 = var1;
   }

   public final v2s$k5 u3() {
      return this.h0;
   }

   public final void n5(v2s$k5 var1) {
      this.h0 = var1;
   }
}
