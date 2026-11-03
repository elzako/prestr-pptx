package com.aspose.slides.internal.y7;

import java.io.IOException;
import java.io.OutputStream;
import java.util.BitSet;

class t2<SELF extends t2<SELF>> {
   private static final char[] u3 = new char[]{'n', 'u', 'l', 'l'};
   private static final char[] a6 = new char[]{'t', 'r', 'u', 'e'};
   private static final char[] u9 = new char[]{'f', 'a', 'l', 's', 'e'};
   private static final char[] h0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
   private static final char[] c8 = new char[]{'\\', 'u', '0', '0'};
   private static final char[] t2 = new char[]{'\\', 'u'};
   protected final Appendable n5;
   protected final OutputStream l6;
   protected final boolean k5;
   private final StringBuilder s7;
   private final byte[] x8;
   private int n3 = 0;
   private BitSet y4 = new BitSet();
   private int e2 = 0;
   private boolean t9 = true;
   private boolean z1;
   private String t4;
   private String q0;
   private int z3 = 0;

   t2(Appendable var1, String var2) {
      this.n5 = var1;
      this.l6 = null;
      this.q0 = var2;
      this.k5 = false;
      this.s7 = new StringBuilder(10240);
      this.x8 = null;
   }

   private SELF n5() {
      return (SELF)this;
   }

   public SELF n5(String var1) {
      this.u3(var1);
      this.n5(u3);
      return this.n5();
   }

   public SELF n5(String var1, String var2) {
      if (var2 == null) {
         return this.n5(var1);
      }

      this.u3(var1);
      this.a6(var2);
      return this.n5();
   }

   public SELF l6() {
      this.t2();
      this.y4.set(this.e2++, this.z1);
      this.z1 = true;
      this.t9 = true;
      this.n5('{');
      if (this.q0 != null) {
         this.z3++;
         this.u9();
      }

      return this.n5();
   }

   public SELF l6(String var1) {
      this.u3(var1);
      this.y4.set(this.e2++, this.z1);
      this.z1 = false;
      this.t9 = true;
      this.n5('[');
      return this.n5();
   }

   public SELF k5() {
      if (this.e2 == 0) {
         throw new s7("Invalid call to end()");
      }

      if (this.z1) {
         if (this.q0 != null) {
            this.z3--;
            this.u9();
            this.a6();
         }

         this.n5('}');
      } else {
         this.n5(']');
      }

      this.t9 = false;
      this.z1 = this.y4.get(--this.e2);
      return this.n5();
   }

   protected void u3() {
      if (this.e2 > 0) {
         throw new s7("Unclosed JSON objects and/or arrays when closing writer");
      }

      if (this.t9) {
         throw new s7("Nothing was written to the JSON writer");
      }

      this.h0();
   }

   private void a6() {
      for (int var1 = 0; var1 < this.z3; var1++) {
         this.k5(this.q0);
      }
   }

   private void u9() {
      this.n5('\n');
   }

   private void k5(String var1) {
      if (this.k5) {
         int var2 = var1.length();
         if (this.n3 + var2 > 10240) {
            this.h0();
         }

         for (int var3 = 0; var3 < var2; var3++) {
            this.x8[this.n3++] = (byte)var1.charAt(var3);
         }
      } else {
         this.s7.append(var1);
         if (this.s7.length() > 10240) {
            this.h0();
         }
      }
   }

   private void n5(char[] var1) {
      if (this.k5) {
         int var2 = var1.length;
         if (this.n3 + var2 > 10240) {
            this.h0();
         }

         for (int var3 = 0; var3 < var2; var3++) {
            this.x8[this.n3++] = (byte)var1[var3];
         }
      } else {
         this.s7.append(var1);
         if (this.s7.length() > 10240) {
            this.h0();
         }
      }
   }

   private void n5(char var1) {
      if (this.k5) {
         if (this.n3 + 1 > 10240) {
            this.h0();
         }

         this.x8[this.n3++] = (byte)var1;
      } else {
         this.s7.append(var1);
         if (this.s7.length() > 10240) {
            this.h0();
         }
      }
   }

   private void h0() {
      try {
         if (this.k5) {
            this.l6.write(this.x8, 0, this.n3);
            this.n3 = 0;
         } else {
            this.n5.append(this.s7.toString());
            this.s7.setLength(0);
         }
      } catch (IOException var2) {
         throw new s7(var2);
      }
   }

   private void c8() {
      if (this.t9) {
         this.t9 = false;
      } else {
         if (this.e2 == 0) {
            throw new s7("Invalid call to emit a value in a finished JSON writer");
         }

         this.n5(',');
         if (this.q0 != null && this.z1) {
            this.u9();
         }
      }
   }

   private void t2() {
      if (this.t4 != null) {
         String var1 = this.t4;
         this.t4 = null;
         this.u3(var1);
      } else {
         if (this.z1) {
            throw new s7("Invalid call to emit a keyless value while writing an object");
         }

         this.c8();
      }
   }

   private void u3(String var1) {
      if (!this.z1) {
         throw new s7("Invalid call to emit a key value while not writing an object");
      }

      if (this.t4 != null) {
         throw new s7("Invalid call to emit a key value immediately after emitting a key");
      }

      this.c8();
      if (this.q0 != null) {
         this.a6();
      }

      this.a6(var1);
      this.n5(':');
   }

   private void a6(String var1) {
      this.n5('"');
      char var2 = '\u0000';
      char var3 = 0;

      for (int var4 = 0; var4 < var1.length(); var4++) {
         var2 = var3;
         var3 = var1.charAt(var4);
         switch (var3) {
            case '\b':
               this.k5("\\b");
               break;
            case '\t':
               this.k5("\\t");
               break;
            case '\n':
               this.k5("\\n");
               break;
            case '\f':
               this.k5("\\f");
               break;
            case '\r':
               this.k5("\\r");
               break;
            case '"':
            case '\\':
               this.n5('\\');
               this.n5(var3);
               break;
            case '/':
               if (var2 == '<') {
                  this.n5('\\');
               }

               this.n5(var3);
               break;
            default:
               if (this.l6(var3)) {
                  if (var3 < 256) {
                     this.n5(c8);
                     this.n5(h0[var3 >> 4 & 15]);
                     this.n5(h0[var3 & 15]);
                  } else {
                     this.n5(t2);
                     this.n5(h0[var3 >> '\f' & 15]);
                     this.n5(h0[var3 >> '\b' & 15]);
                     this.n5(h0[var3 >> 4 & 15]);
                     this.n5(h0[var3 & 15]);
                  }
               } else if (this.k5) {
                  if (this.n3 + 4 > 10240) {
                     this.h0();
                  }

                  if (var3 < 128) {
                     this.x8[this.n3++] = (byte)var3;
                  } else if (var3 < 2048) {
                     this.x8[this.n3++] = (byte)(192 | var3 >> 6);
                     this.x8[this.n3++] = (byte)(128 | var3 & 63);
                  } else if (var3 < '\ud800') {
                     this.x8[this.n3++] = (byte)(224 | var3 >> '\f');
                     this.x8[this.n3++] = (byte)(128 | var3 >> 6 & 63);
                     this.x8[this.n3++] = (byte)(128 | var3 & 63);
                  } else if (var3 < '\udfff') {
                     int var5 = Character.toCodePoint(var3, var1.charAt(++var4));
                     if (var5 >= 2097151) {
                        throw new s7("Unable to encode character 0x" + Integer.toHexString(var5));
                     }

                     this.x8[this.n3++] = (byte)(240 | var5 >> 18);
                     this.x8[this.n3++] = (byte)(128 | var5 >> 12 & 63);
                     this.x8[this.n3++] = (byte)(128 | var5 >> 6 & 63);
                     this.x8[this.n3++] = (byte)(128 | var5 & 63);
                  } else {
                     this.x8[this.n3++] = (byte)(224 | var3 >> '\f');
                     this.x8[this.n3++] = (byte)(128 | var3 >> 6 & 63);
                     this.x8[this.n3++] = (byte)(128 | var3 & 63);
                  }
               } else {
                  this.n5(var3);
               }
         }
      }

      this.n5('"');
   }

   private boolean l6(char var1) {
      return var1 < ' ' || var1 >= 128 && var1 < 160 || var1 >= 8192 && var1 < 8448;
   }
}
