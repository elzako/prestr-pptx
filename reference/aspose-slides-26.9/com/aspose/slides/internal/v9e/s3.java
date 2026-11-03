package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.ms.System.Xml.k6;

public class s3 extends w1 {
   private s3 l6;
   private boolean k5;
   private boolean u3;
   private Hashtable a6;
   private Hashtable u9;
   private Hashtable h0;

   public final s3 l6() {
      return this.l6;
   }

   public final Hashtable k5() {
      return this.a6;
   }

   public final boolean u3() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean a6() {
      return this.u3;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   public s3(s3 var1) {
      this.n5(var1);
   }

   public final void n5(s3 var1) {
      this.n5 = null;
      this.l6 = var1;
      if (this.l6 != null) {
         this.k5 = this.l6.k5;
         this.u3 = this.l6.u3;
      }
   }

   public final void k5(String var1) {
      if (this.u9 == null) {
         this.u9 = new Hashtable();
      }

      this.u9.set_Item(var1, null);
   }

   public final boolean u3(String var1) {
      return this.u9 == null ? false : this.u9.contains(var1);
   }

   public final void a6(String var1) {
      if (this.h0 == null) {
         this.h0 = new Hashtable();
      }

      this.h0.set_Item(var1, null);
   }

   public final boolean u9(String var1) {
      return this.h0 == null ? false : this.h0.contains(var1);
   }

   public final void n5(d1 var1) {
      if (this.a6 == null) {
         this.a6 = new Hashtable();
      }

      this.a6.set_Item(var1.k5(), var1);
   }

   public final int u9() {
      return this.a6 == null ? 0 : this.a6.size();
   }

   public final d1 n5(k6 var1) {
      for (s3 var2 = this; var2 != null; var2 = var2.l6()) {
         if (var2.k5() != null) {
            d1 var3 = (d1)var2.k5().get_Item(var1);
            if (var3 != null) {
               return var3;
            }
         }
      }

      return null;
   }

   public final d1 l6(k6 var1) {
      s3 var2 = null;

      for (s3 var3 = this; var3 != null; var3 = var3.l6()) {
         var2 = var3;
      }

      return var2.n5(var1);
   }
}
