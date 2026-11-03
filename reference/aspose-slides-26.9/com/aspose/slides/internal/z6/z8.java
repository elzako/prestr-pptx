package com.aspose.slides.internal.z6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;

public class z8 {
   private Dictionary<String, h0> n5 = new Dictionary<>();
   private Dictionary<String, l6> l6 = new Dictionary<>();
   private Dictionary<String, k5> k5 = new Dictionary<>();
   private boolean u3 = false;

   public z8() {
      this.l6();
   }

   public final boolean n5() {
      return this.u3;
   }

   public final void n5(h0 var1) {
      String[] var2 = var1.l6();

      for (int var3 = 0; var3 < var2.length; var3++) {
         this.n5.addItem(var2[var3], var1);
      }
   }

   public final h0 n5(String var1) {
      Object var2 = null;
      h0[] var3 = new h0[]{(h0)var2};
      this.n5.tryGetValue(var1, var3);
      return var3[0];
   }

   public final l6 l6(String var1) {
      return this.l6.containsKey(var1) ? this.l6.get_Item(var1) : null;
   }

   public final k5 k5(String var1) {
      return this.k5.containsKey(var1) ? this.k5.get_Item(var1) : null;
   }

   public final x8 n5(com.aspose.slides.internal.y1.u3 var1, String var2) {
      if (var1.u9() != null) {
         return n5(var1.u9());
      }

      if (var1.h0() != null) {
         return var1.h0();
      }

      x8 var3;
      if (this.n5()) {
         var3 = this.u3(var1, var2);
         if (var3 == null) {
            var3 = this.k5(var1, var2);
         }
      } else {
         var3 = this.k5(var1, var2);
         if (var3 == null) {
            var3 = this.u3(var1, var2);
         }
      }

      if (var3 == null) {
         throw new NotSupportedException(d1.n5(new String[]{"No renderer for the requested format available: ", var2}));
      } else {
         return var3;
      }
   }

   private x8 k5(com.aspose.slides.internal.y1.u3 var1, String var2) {
      k5 var3 = this.k5(var2);
      if (var3 != null) {
         com.aspose.slides.internal.o5.l6 var4 = this.l6(var1, var2);
         return n5(var4);
      } else {
         return null;
      }
   }

   private x8 u3(com.aspose.slides.internal.y1.u3 var1, String var2) {
      h0 var3 = this.n5(var2);
      if (var3 != null) {
         x8 var4 = var3.n5(var1);
         n3 var5 = var3.l6(var1);
         if (var5 != null) {
            var5.n5(var4);
         }

         return var4;
      } else {
         return null;
      }
   }

   private static x8 n5(com.aspose.slides.internal.o5.l6 var0) {
      return null;
   }

   public final com.aspose.slides.internal.e5.c8 n5(com.aspose.slides.internal.y1.u3 var1, String var2, com.aspose.slides.internal.z0k.t4 var3) {
      if (var1.c8() != null) {
         return var1.c8();
      }

      l6 var4 = this.l6(var2);
      if (var4 != null) {
         return var4.n5(var1, var3);
      }

      h0 var5 = this.n5(var2);
      k5 var6 = null;
      boolean var7 = var1.h0() == null && var1.u9() == null;
      if (var5 == null) {
         var6 = this.k5(var2);
         if (var6 != null) {
            var7 &= var3 == null && var6.n5();
         }
      } else {
         var7 &= var3 == null && var5.n5();
      }

      if (var1.h0() == null && var5 == null && var1.u9() == null && var6 == null) {
         throw new NotSupportedException(
            d1.n5(new String[]{
               "Don't know how to handle \"",
               var2,
               "\" as an output format.",
               " Neither an FOEventHandler, nor a Renderer could be found",
               " for this output format."
            })
         );
      } else if (var7) {
         throw new com.aspose.slides.internal.y1.l6("OutputStream has not been set");
      } else {
         return new com.aspose.slides.internal.a0.a6(var1, var2, var3);
      }
   }

   public final com.aspose.slides.internal.o5.l6 l6(com.aspose.slides.internal.y1.u3 var1, String var2) {
      if (var1.u9() != null) {
         return var1.u9();
      }

      k5 var3 = this.k5(var2);
      if (var3 == null) {
         throw new NotSupportedException(d1.n5(new String[]{"No IF document handler for the requested format available: ", var2}));
      }

      com.aspose.slides.internal.o5.l6 var4 = var3.n5(var1);
      com.aspose.slides.internal.o5.k5 var5 = var4.n5();
      if (var5 != null) {
         var5.n5(var4);
      }

      return new com.aspose.slides.internal.o5.n5(var4, var1);
   }

   private void l6() {
      this.n5(new com.aspose.slides.internal.e9.a6());
      this.n5(new com.aspose.slides.internal.e9.u9());
   }
}
