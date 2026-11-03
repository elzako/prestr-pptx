package com.aspose.slides.internal.e7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.v2.e2;
import com.aspose.slides.ms.System.IDisposable;

public class t2 implements e2 {
   private final com.aspose.slides.internal.v2.k5 n5;
   private Dictionary<String, com.aspose.slides.internal.l9.h0> l6;
   private Dictionary<com.aspose.slides.internal.l9.h0, String> k5;
   private Dictionary<String, u3> u3;
   private Dictionary<String, com.aspose.slides.internal.z2.l6> a6;
   private Dictionary<String, com.aspose.slides.internal.u1.u3> u9;
   private Dictionary<com.aspose.slides.internal.u1.u3, String> h0;
   private Dictionary<String, com.aspose.slides.internal.m5.h0> c8;
   private Dictionary<String, com.aspose.slides.internal.g9.a6> t2;
   private final n5 s7;

   public t2() {
      this.n5 = new com.aspose.slides.internal.v2.k5();
      this.s7 = null;
   }

   public t2(com.aspose.slides.internal.v2.k5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("'CosDictionary resources' parameter is null");
      }

      this.n5 = var1;
      this.s7 = null;
   }

   public final Dictionary<String, com.aspose.slides.internal.g9.a6> n5() {
      if (this.t2 == null) {
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.f5);
         if (var1 != null) {
            this.t2 = new Dictionary<>();
            IGenericEnumerator var2 = var1.n5().iterator();

            try {
               while (var2.hasNext()) {
                  com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var2.next();
                  com.aspose.slides.internal.v2.s7 var4 = var1.u9(var3);
                  com.aspose.slides.internal.g9.a6 var5 = null;

                  try {
                     var5 = com.aspose.slides.internal.g9.u9.n5(var4);
                  } catch (IOException var10) {
                  }

                  if (var5 != null) {
                     String var6 = var3.n5();
                     if (!this.t2.containsKey(var6)) {
                        this.t2.addItem(var6, var5);
                     } else {
                        this.t2.set_Item(var6, var5);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }
      }

      return this.t2;
   }

   public final Dictionary<String, com.aspose.slides.internal.u1.u3> l6() {
      if (this.u9 != null) {
         return this.u9;
      }

      this.u9 = new Dictionary<>();
      com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.c7);
      if (var1 == null) {
         var1 = new com.aspose.slides.internal.v2.k5();
         this.n5.l6(com.aspose.slides.internal.v2.c8.c7, var1);
      } else {
         IGenericEnumerator var2 = var1.n5().iterator();

         try {
            while (var2.hasNext()) {
               com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var2.next();
               com.aspose.slides.internal.v2.s7 var4 = var1.u9(var3);
               if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.v2.k5.class)) {
                  com.aspose.slides.internal.u1.u3 var5 = com.aspose.slides.internal.u1.h0.n5((com.aspose.slides.internal.v2.k5)var4);
                  if (var5 != null) {
                     this.u9.addItem(var3.n5(), var5);
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      this.l6(this.u9);
      return this.u9;
   }

   public final Dictionary<String, u3> k5() {
      if (this.u3 != null) {
         return this.u3;
      }

      this.u3 = new Dictionary<>();
      com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.l0);
      if (var1 != null) {
         IGenericEnumerator var2 = var1.n5().iterator();

         try {
            while (var2.hasNext()) {
               com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var2.next();
               com.aspose.slides.internal.v2.k5 var4 = (com.aspose.slides.internal.v2.k5)var1.u9(var3);
               String var5 = var3.n5();
               u3 var6 = new u3(var4);
               this.u3.addItem(var5, var6);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      return this.u3;
   }

   public final Dictionary<String, com.aspose.slides.internal.z2.l6> u3() {
      if (this.a6 == null) {
         this.a6 = new Dictionary<>();
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.t4r);
         if (var1 != null) {
            IGenericEnumerator var2 = var1.n5().iterator();

            try {
               while (var2.hasNext()) {
                  com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var2.next();
                  com.aspose.slides.internal.v2.k5 var4 = (com.aspose.slides.internal.v2.k5)var1.u9(var3);
                  String var5 = var3.n5();
                  com.aspose.slides.internal.z2.l6 var6 = com.aspose.slides.internal.z2.l6.n5(var4);
                  this.a6.addItem(var5, var6);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }
      }

      return this.a6;
   }

   public final n5 a6() {
      return this.s7;
   }

   private com.aspose.slides.internal.v2.s7 n5(com.aspose.slides.internal.v2.c8 var1, com.aspose.slides.internal.v2.c8 var2) {
      com.aspose.slides.internal.v2.k5 var3 = (com.aspose.slides.internal.v2.k5)this.n5.u9(var1);
      return var3 == null ? null : var3.u9(var2);
   }

   public final com.aspose.slides.internal.l9.h0 n5(com.aspose.slides.internal.v2.c8 var1) {
      com.aspose.slides.internal.v2.s7 var2 = this.l6(com.aspose.slides.internal.v2.c8.q9u, var1);
      if (this.s7 != null && var2 != null) {
         com.aspose.slides.internal.l9.h0 var3 = this.s7.l6(var2);
         if (var3 != null) {
            return var3;
         }
      }

      com.aspose.slides.internal.v2.s7 var4 = this.n5(com.aspose.slides.internal.v2.c8.q9u, var1);
      com.aspose.slides.internal.l9.h0 var6;
      if (var4 == null) {
         var6 = null;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.v2.s7.class)) {
         com.aspose.slides.internal.v2.s7 var5 = var4.t2();
         var6 = com.aspose.slides.internal.l9.h0.n5(var5, false, this);
      } else {
         var6 = com.aspose.slides.internal.l9.h0.n5(var4, false, this);
      }

      boolean var7 = this.n5(var6);
      if (this.s7 != null && var7) {
         this.s7.n5(var2, var6);
      }

      return var6;
   }

   private boolean n5(com.aspose.slides.internal.l9.h0 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.l9.u3.class)) {
         com.aspose.slides.internal.v2.x8 var2 = var1.e2();
         com.aspose.slides.internal.v2.s7 var3 = var2.u9(com.aspose.slides.internal.v2.c8.f5);
         if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.c8.class)) {
            com.aspose.slides.internal.v2.c8 var4 = (com.aspose.slides.internal.v2.c8)var3;
            boolean var5 = this.l6(com.aspose.slides.internal.v2.c8.y5);
            if (var4.equals(com.aspose.slides.internal.v2.c8.f4) && var5) {
               return false;
            }

            boolean var6 = this.l6(com.aspose.slides.internal.v2.c8.k8);
            if (var4.equals(com.aspose.slides.internal.v2.c8.w3) && var6) {
               return false;
            }

            boolean var7 = this.l6(com.aspose.slides.internal.v2.c8.b5);
            if (var4.equals(com.aspose.slides.internal.v2.c8.y9) && var7) {
               return false;
            }

            boolean var8 = this.l6(var4);
            if (var8) {
               return false;
            }
         }
      }

      return true;
   }

   public final Dictionary<String, com.aspose.slides.internal.m5.h0> u9() {
      if (this.c8 == null) {
         this.c8 = new Dictionary<>();
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.d0p);
         if (var1 != null) {
            IGenericEnumerator var2 = var1.n5().iterator();

            try {
               while (var2.hasNext()) {
                  com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var2.next();
                  com.aspose.slides.internal.v2.s7 var4 = var1.u9(var3);
                  if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.v2.k5.class)) {
                     String var5 = var3.n5();

                     try {
                        com.aspose.slides.internal.m5.h0 var6 = com.aspose.slides.internal.m5.h0.n5((com.aspose.slides.internal.v2.k5)var4);
                        if (var6 != null) {
                           this.c8.addItem(var5, var6);
                        }
                     } catch (IOException var10) {
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }
      }

      return this.c8;
   }

   public final boolean l6(com.aspose.slides.internal.v2.c8 var1) {
      com.aspose.slides.internal.v2.s7 var2 = this.n5(com.aspose.slides.internal.v2.c8.f5, var1);
      return var2 != null;
   }

   private com.aspose.slides.internal.v2.s7 l6(com.aspose.slides.internal.v2.c8 var1, com.aspose.slides.internal.v2.c8 var2) {
      com.aspose.slides.internal.v2.k5 var3 = (com.aspose.slides.internal.v2.k5)this.n5.u9(var1);
      return var3 == null ? null : var3.n3(var2);
   }

   public final Dictionary<String, com.aspose.slides.internal.l9.h0> h0() {
      if (this.l6 == null) {
         this.l6 = new Dictionary<>();
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.q9u);
         if (var1 == null) {
            var1 = new com.aspose.slides.internal.v2.k5();
            this.n5.l6(com.aspose.slides.internal.v2.c8.q9u, var1);
         } else {
            IGenericEnumerator var2 = var1.n5().iterator();

            try {
               while (var2.hasNext()) {
                  com.aspose.slides.internal.v2.c8 var3 = (com.aspose.slides.internal.v2.c8)var2.next();
                  com.aspose.slides.internal.l9.h0 var4 = null;

                  try {
                     com.aspose.slides.internal.v2.s7 var5 = var1.u9(var3);
                     var4 = com.aspose.slides.internal.l9.h0.n5(var5, this);
                  } catch (IOException var9) {
                  }

                  String var12 = var3.n5();
                  if (var4 != null && !this.l6.containsKey(var12)) {
                     this.l6.addItem(var12, var4);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }

         this.n5(this.l6);
      }

      return this.l6;
   }

   public final void n5(Dictionary<String, com.aspose.slides.internal.l9.h0> var1) {
      this.l6 = var1;
      if (var1 != null) {
         com.aspose.slides.internal.v2.k5 var2 = com.aspose.slides.internal.v2.k5.n5(var1);
         this.n5.l6(com.aspose.slides.internal.v2.c8.q9u, var2);
         this.k5 = this.k5(this.l6);
      } else {
         this.n5.l6(com.aspose.slides.internal.v2.c8.q9u);
         this.k5 = null;
      }
   }

   public final void l6(Dictionary<String, com.aspose.slides.internal.u1.u3> var1) {
      this.u9 = var1;
      if (var1 != null) {
         if (!this.n5.n5(com.aspose.slides.internal.v2.c8.c7)) {
            com.aspose.slides.internal.v2.k5 var2 = com.aspose.slides.internal.v2.k5.n5(var1);
            this.n5.l6(com.aspose.slides.internal.v2.c8.c7, var2);
            this.h0 = this.k5(var1);
         }
      } else {
         this.n5.l6(com.aspose.slides.internal.v2.c8.c7);
         this.h0 = null;
      }
   }

   private <T> Dictionary<T, String> k5(Dictionary<String, T> var1) {
      Dictionary var2 = new Dictionary();
      Dictionary$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            var2.addItem(var4.getValue(), var4.getKey());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.n5;
   }
}
