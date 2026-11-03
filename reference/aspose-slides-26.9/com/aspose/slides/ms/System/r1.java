package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.UriFormatException;
import java.net.URI;

public class r1 {
   private String n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private r8 t2;
   private boolean s7;

   public r1() {
      this.n5(r8.a6, "localhost", -1, d1.n5, d1.n5);
   }

   public r1(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("uriString");
      }

      r8 var2 = null;
      r8[] var3 = new r8[]{var2};
      boolean var4 = r8.n5(var1, 1, var3);
      var2 = var3[0];
      if (var4) {
         this.n5(var2);
      } else {
         if (d1.t2(var1, r8.n5)) {
            throw new UriFormatException();
         }

         this.n5(new r8(d1.n5(new String[]{r8.a6, r8.n5, var1})));
      }
   }

   private void n5(r8 var1) {
      this.n5(var1.t9(), var1.a6(), var1.y4(), var1.n5(), d1.n5);
      this.u9 = var1.u3();
      this.a6 = var1.e2();
      this.h0 = var1.t4();
      int var2 = d1.u3(this.h0, ':');
      if (var2 != -1) {
         this.c8 = d1.k5(this.h0, var2 + 1);
         this.h0 = d1.l6(this.h0, 0, var2);
      } else {
         this.c8 = d1.n5;
      }
   }

   private void n5(String var1, String var2, int var3, String var4, String var5) {
      this.s7 = true;
      this.a6(var1);
      this.l6(var2);
      this.n5(var3);
      this.k5(var4);
      this.a6 = d1.n5;
      this.u9 = d1.n5;
      this.k5(var4);
      this.h0 = d1.n5;
      this.c8 = d1.n5;
      if (!d1.n5(var5)) {
         if (var5.charAt(0) == '#') {
            this.n5(d1.n5(var5, 0, 1));
         } else {
            if (var5.charAt(0) != '?') {
               throw new ArgumentException("extraValue");
            }

            this.u3(d1.n5(var5, 0, 1));
         }
      }
   }

   public void n5(String var1) {
      this.u9 = var1;
      if (this.u9 == null) {
         this.u9 = d1.n5;
      } else if (this.u9.length() > 0) {
         this.u9 = d1.n5(new String[]{"#", d1.n5(var1, "%23", "#")});
      }

      this.s7 = true;
   }

   public void l6(String var1) {
      if (d1.n5(var1)) {
         this.l6 = d1.n5;
      } else if (d1.u3(var1, ':') != -1 && var1.charAt(0) != '[') {
         this.l6 = d1.n5(new String[]{"[", var1, "]"});
      } else {
         this.l6 = var1;
      }

      this.s7 = true;
   }

   public void k5(String var1) {
      if (var1 != null && var1.length() != 0) {
         this.u3 = r8.n5(var1.replace('\\', '/'), r8.y4);
      } else {
         this.u3 = "/";
      }

      this.s7 = true;
   }

   public void n5(int var1) {
      if (var1 < -1) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.k5 = var1;
      this.s7 = true;
   }

   public void u3(String var1) {
      if (var1 != null && var1.length() != 0) {
         this.a6 = d1.n5(new String[]{"?", var1});
      } else {
         this.a6 = d1.n5;
      }

      this.s7 = true;
   }

   public void a6(String var1) {
      if (var1 == null) {
         var1 = d1.n5;
      }

      int var2 = d1.u3(var1, ':');
      if (var2 != -1) {
         var1 = d1.l6(var1, 0, var2);
      }

      this.n5 = d1.u9(var1);
      this.s7 = true;
   }

   public URI n5() {
      return r8.l6(this.l6());
   }

   r8 l6() {
      if (!this.s7) {
         return this.t2;
      }

      this.t2 = new r8(this.toString());
      this.l6 = this.t2.a6();
      this.u3 = this.t2.n5();
      this.s7 = false;
      return this.t2;
   }

   @Override
   public boolean equals(Object rparam) {
      return rparam == null ? false : this.l6().equals(rparam.toString());
   }

   @Override
   public int hashCode() {
      return this.l6().hashCode();
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5(this.n5);
      var1.n5(r8.h0(this.n5));
      if (!d1.a6(this.h0, d1.n5)) {
         var1.n5(this.h0);
         if (!d1.a6(this.c8, d1.n5)) {
            var1.n5(d1.n5(new String[]{":", this.c8}));
         }

         var1.n5('@');
      }

      if (this.l6.length() > 0) {
         var1.n5(this.l6);
         if (this.k5 > 0) {
            var1.n5(d1.n5(new String[]{":", a3.l6(this.k5)}));
         }
      }

      if (!d1.a6(this.u3, d1.n5) && var1.l6(var1.l6() - 1) != '/' && this.u3.length() > 0 && this.u3.charAt(0) != '/') {
         var1.n5('/');
      }

      var1.n5(this.u3);
      var1.n5(this.a6);
      var1.n5(this.u9);
      return var1.toString();
   }
}
