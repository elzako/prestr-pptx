package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o8m.z7;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;
import com.aspose.slides.ms.System.p8;
import java.util.TreeMap;

public class q0 {
   private static boolean l6 = false;
   private static String k5;
   private static boolean u3 = true;
   private static TreeMap<String, String> a6 = new TreeMap<>();
   private com.aspose.slides.internal.o8m.t9 u9;
   private String h0;
   private String c8;
   private String t2;
   static final Object n5 = new Object();

   public q0(com.aspose.slides.internal.o8m.t9 var1) {
      this(var1, null, null);
   }

   public q0(com.aspose.slides.internal.o8m.t9 var1, String var2, String var3) {
      if (var1 == null) {
         throw new ArgumentNullException("parameters");
      }

      this.u9 = this.n5(var1);
      this.h0 = var2;
      k5 = var3;
   }

   public String n5() {
      if (this.c8 == null) {
         this.c8 = d1.n5(com.aspose.slides.internal.x7n.l6.k5(), "[{0}][{1}][{2}].xml", this.u9.u3, this.t2(), this.u9.l6);
         if (u3) {
            this.c8 = com.aspose.slides.internal.z0k.z1.l6(u9(), this.c8);
         }
      }

      return this.c8;
   }

   public String l6() {
      return this.h0;
   }

   public void n5(String var1) {
      if (this.h0()) {
         this.h0 = var1;
      }
   }

   public boolean k5() {
      boolean var1 = false;
      if (u3) {
         var1 = com.aspose.slides.internal.z0k.u9.k5(this.n5());
         if (var1) {
            com.aspose.slides.internal.z0k.m3 var2 = com.aspose.slides.internal.z0k.u9.a6(this.n5());

            try {
               this.l6(var2.c8());
            } finally {
               if (var2 != null) {
                  var2.u3();
               }
            }
         }
      } else {
         var1 = a6.containsKey(this.n5());
         if (var1) {
            this.l6(a6.get(this.n5()));
         }
      }

      return var1;
   }

   public void u3() {
      if (u3) {
         com.aspose.slides.internal.z0k.n3 var1 = com.aspose.slides.internal.z0k.u9.n5(this.n5(), 2);

         try {
            com.aspose.slides.internal.z0k.j5 var2 = new com.aspose.slides.internal.z0k.j5(var1, com.aspose.slides.internal.l7h.j5.z3());
            var2.n5(this.s7());
            var2.u3();
         } finally {
            if (var1 != null) {
               var1.close();
            }
         }
      } else {
         a6.put(this.n5(), this.s7());
      }
   }

   public void a6() {
      if (u3) {
         com.aspose.slides.internal.z0k.u9.l6(this.n5());
      } else if (a6.containsKey(this.n5())) {
         a6.remove(this.n5());
      }
   }

   private static String u9() {
      synchronized (n5) {
         if (u3 && (k5 == null || !l6)) {
            if (k5 == null) {
               k5 = com.aspose.slides.internal.z0k.z1.n5();
            }

            k5 = com.aspose.slides.internal.z0k.z1.l6(k5, "keypairs");
            l6 = com.aspose.slides.internal.z0k.u3.k5(k5);
            if (!l6) {
               try {
                  com.aspose.slides.internal.z0k.u3.n5(k5);
                  l6 = true;
               } catch (RuntimeException var4) {
                  String var2 = z3.n5("Could not create user key store '{0}'.");
                  throw new CryptographicException(d1.n5(var2, new Object[]{k5}), var4);
               }
            }
         }
      }

      return k5;
   }

   private boolean h0() {
      return this.h0 == null;
   }

   private boolean c8() {
      return (this.u9.n5() & 2) == 2;
   }

   private String t2() {
      if (this.t2 == null) {
         if (this.c8()) {
            this.t2 = "default";
         } else if (this.u9.n5 != null && this.u9.n5.length() != 0) {
            byte[] var1 = com.aspose.slides.internal.l7h.j5.z3().u3(this.u9.n5);
            z7 var2 = z7.a6();
            byte[] var3 = var2.l6(var1);
            this.t2 = new o0(var3).toString();
         } else {
            this.t2 = o0.l6().toString();
         }
      }

      return this.t2;
   }

   private com.aspose.slides.internal.o8m.t9 n5(com.aspose.slides.internal.o8m.t9 var1) {
      com.aspose.slides.internal.o8m.t9 var2 = new com.aspose.slides.internal.o8m.t9(var1.u3, var1.k5, var1.n5);
      var2.l6 = var1.l6;
      var2.n5(var1.n5());
      return var2;
   }

   private void l6(String var1) {
      com.aspose.slides.internal.w2f.n5 var2 = new com.aspose.slides.internal.w2f.n5();
      var2.n5(var1);
      com.aspose.slides.internal.u0a.l6 var3 = var2.n5();
      if ("KeyPair".equals(var3.l6())) {
         com.aspose.slides.internal.u0a.l6 var4 = var3.h0("KeyValue");
         if (var4.n5().size() > 0) {
            this.h0 = var4.n5().get_Item(0).toString();
         }
      }
   }

   private String s7() {
      a5 var1 = new a5();
      a5.n5(var1, "<KeyPair>{0}\t<Properties>{0}\t\t<Provider ", p8.n5);
      if (this.u9.k5 != null && this.u9.k5.length() != 0) {
         a5.n5(var1, "Name=\"{0}\" ", this.u9.k5);
      }

      a5.n5(var1, "Type=\"{0}\" />{1}\t\t<Container ", this.u9.u3, p8.n5);
      a5.n5(var1, "Name=\"{0}\" />{1}\t</Properties>{1}\t<KeyValue", this.t2(), p8.n5);
      if (this.u9.l6 != -1) {
         a5.n5(var1, " Id=\"{0}\" ", this.u9.l6);
      }

      a5.n5(var1, ">{1}\t\t{0}{1}\t</KeyValue>{1}</KeyPair>{1}", this.l6(), p8.n5);
      return var1.toString();
   }
}
