package com.aspose.slides.internal.j9e;

import com.aspose.slides.ms.System.o0;

public final class x8 {
   private o0 n5 = new o0();
   private String l6;
   private static final Object k5 = new Object();
   private static x8 u3;
   private static x8 a6;
   private static x8 u9;
   private static x8 h0;
   private static x8 c8;
   private static x8 t2;
   private static x8 s7;
   private static x8 x8;
   private static x8 n3;
   private static x8 y4;

   public x8(o0 var1) {
      var1.k5(this.n5);
   }

   private x8(String var1, String var2) {
      this.l6 = var1;
      this.n5 = new o0(var2);
   }

   @Override
   public boolean equals(Object o) {
      x8 var2 = o instanceof x8 ? (x8)o : null;
      return var2 != null && var2.n5().equals(this.n5);
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }

   @Override
   public String toString() {
      return this.l6 != null ? this.l6 : "[ImageFormat: " + this.n5.toString() + "]";
   }

   public o0 n5() {
      return this.n5;
   }

   public boolean l6() {
      return this.equals(a6) || this.equals(y4);
   }

   public static x8 k5() {
      synchronized (k5) {
         if (u3 == null) {
            u3 = new x8("Bmp", "b96b3cab-0728-11d3-9d7b-0000f81ef32e");
         }

         return u3;
      }
   }

   public static x8 u3() {
      synchronized (k5) {
         if (a6 == null) {
            a6 = new x8("Emf", "b96b3cac-0728-11d3-9d7b-0000f81ef32e");
         }

         return a6;
      }
   }

   public static x8 a6() {
      synchronized (k5) {
         if (u9 == null) {
            u9 = new x8("Exif", "b96b3cb2-0728-11d3-9d7b-0000f81ef32e");
         }

         return u9;
      }
   }

   public static x8 u9() {
      synchronized (k5) {
         if (h0 == null) {
            h0 = new x8("Gif", "b96b3cb0-0728-11d3-9d7b-0000f81ef32e");
         }

         return h0;
      }
   }

   public static x8 h0() {
      synchronized (k5) {
         if (x8 == null) {
            x8 = new x8("Icon", "b96b3cb5-0728-11d3-9d7b-0000f81ef32e");
         }

         return x8;
      }
   }

   public static x8 c8() {
      synchronized (k5) {
         if (n3 == null) {
            n3 = new x8("Jpeg", "b96b3cae-0728-11d3-9d7b-0000f81ef32e");
         }

         return n3;
      }
   }

   public static x8 t2() {
      synchronized (k5) {
         if (s7 == null) {
            s7 = new x8("MemoryBMP", "b96b3caa-0728-11d3-9d7b-0000f81ef32e");
         }

         return s7;
      }
   }

   public static x8 s7() {
      synchronized (k5) {
         if (t2 == null) {
            t2 = new x8("Png", "b96b3caf-0728-11d3-9d7b-0000f81ef32e");
         }

         return t2;
      }
   }

   public static x8 x8() {
      synchronized (k5) {
         if (c8 == null) {
            c8 = new x8("Tiff", "b96b3cb1-0728-11d3-9d7b-0000f81ef32e");
         }

         return c8;
      }
   }

   public static x8 n3() {
      synchronized (k5) {
         if (y4 == null) {
            y4 = new x8("Wmf", "b96b3cad-0728-11d3-9d7b-0000f81ef32e");
         }

         return y4;
      }
   }
}
