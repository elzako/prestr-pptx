package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.exceptions.ArgumentNullException;

public class y9 extends y1 {
   private y2 n5;
   private y2 u3;
   private y9 a6;
   private y1 u9;

   @Override
   public String u3() {
      return "Scope";
   }

   @Override
   public String c8() {
      return "object";
   }

   public final y9 s7() {
      return this.a6 != null ? this.a6 : this;
   }

   @Override
   public g7 n5(String var1) {
      if ("this".equals(var1) && this.n5 != null) {
         return this.n5.n5(this);
      } else {
         return "arguments".equals(var1) && this.u3 != null ? this.u3.n5(this) : super.n5(var1);
      }
   }

   @Override
   public void n5(String var1, g7 var2) {
      if ("this".equals(var1)) {
         if (this.n5 != null) {
            this.n5.n5(this, var2);
         } else {
            this.n5(this.n5 = new u2(this, var1, var2));
         }
      } else if ("arguments".equals(var1)) {
         if (this.u3 != null) {
            this.u3.n5(this, var2);
         } else {
            this.n5(this.u3 = new u2(this, var1, var2));
         }
      } else {
         y2 var3 = this.a6(var1);
         if (var3 != null) {
            var3.n5(this, var2);
         } else if (this.a6 != null) {
            this.a6.l6(var1, var2);
         } else {
            this.l6(var1, var2);
         }
      }
   }

   @Override
   public y2 a6(String var1) {
      y2 var2;
      if ((var2 = super.a6(var1)) != null && var2.a6() == this) {
         return var2;
      } else {
         y2 var3;
         if (this.u9 != null && (var3 = this.u9.a6(var1)) != null) {
            d1 var4 = new d1(this, var3.n5(), var3, this.u9);
            this.n5(var4);
            return var4;
         } else {
            return var2;
         }
      }
   }

   @Override
   public IGenericEnumerable<String> a6() {
      return new y9$n5(this);
   }

   private y2 u9(String var1) {
      return super.a6(var1);
   }

   private IGenericEnumerable<String> x8() {
      return super.a6();
   }

   @Override
   public IGenericEnumerable<g7> u9() {
      return new y9$l6(this);
   }

   @Override
   public Object C_() {
      return this.u9 != null ? this.u9.C_() : null;
   }

   @Override
   public void n5(Object var1) {
      if (this.u9 != null) {
         this.u9.n5(var1);
      }
   }

   public y9(y9 var1) {
      super(var1);
      if (var1 == null) {
         throw new ArgumentNullException("outer");
      }

      this.a6 = var1.s7();
   }

   public y9(y9 var1, y1 var2) {
      super(var1);
      if (var1 == null) {
         throw new ArgumentNullException("outer");
      }

      if (var2 == null) {
         throw new ArgumentNullException("bag");
      }

      this.a6 = var1.s7();
      this.u9 = var2;
   }

   public y9(y1 var1) {
      super(y5.n5);
      this.u9 = var1;
   }

   // $VF: synthetic method
   static y1 n5(y9 var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static IGenericEnumerable l6(y9 var0) {
      return var0.x8();
   }

   // $VF: synthetic method
   static y2 n5(y9 var0, String var1) {
      return var0.u9(var1);
   }
}
