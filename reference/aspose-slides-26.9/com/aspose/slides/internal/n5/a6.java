package com.aspose.slides.internal.n5;

public class a6 implements Cloneable {
   protected long[] n5;

   public a6() {
      this(64);
   }

   public a6(long[] var1) {
      this.n5 = var1;
   }

   public a6(int var1) {
      this.n5 = new long[(var1 - 1 >> 6) + 1];
   }

   public static a6 n5(int var0) {
      a6 var1 = new a6(var0 + 1);
      var1.l6(var0);
      return var1;
   }

   public static a6 n5(int var0, int var1) {
      a6 var2 = new a6(Math.max(var0, var1) + 1);
      var2.l6(var0);
      var2.l6(var1);
      return var2;
   }

   public static a6 n5(int var0, int var1, int var2) {
      a6 var3 = new a6();
      var3.l6(var0);
      var3.l6(var1);
      var3.l6(var2);
      return var3;
   }

   public a6 n5(a6 var1) {
      if (var1 == null) {
         return this;
      }

      a6 var2 = (a6)this.clone();
      var2.l6(var1);
      return var2;
   }

   public void l6(int var1) {
      int var2 = t2(var1);
      if (var2 >= this.n5.length) {
         this.k5(var1);
      }

      this.n5[var2] = this.n5[var2] | h0(var1);
   }

   public void k5(int var1) {
      int var2 = Math.max(this.n5.length << 1, this.c8(var1));
      long[] var3 = new long[var2];
      System.arraycopy(this.n5, 0, var3, 0, this.n5.length);
      this.n5 = var3;
   }

   public void l6(a6 var1) {
      if (var1 != null) {
         if (var1.n5.length > this.n5.length) {
            this.u9(var1.n5.length);
         }

         int var2 = Math.min(this.n5.length, var1.n5.length);

         for (int var3 = var2 - 1; var3 >= 0; var3--) {
            this.n5[var3] = this.n5[var3] | var1.n5[var3];
         }
      }
   }

   private void u9(int var1) {
      long[] var2 = new long[var1];
      int var3 = Math.min(var1, this.n5.length);
      System.arraycopy(this.n5, 0, var2, 0, var3);
      this.n5 = var2;
   }

   private static final long h0(int var0) {
      int var1 = var0 & 63;
      return 1L << var1;
   }

   @Override
   public Object clone() {
      try {
         a6 var1 = (a6)super.clone();
         var1.n5 = new long[this.n5.length];
         System.arraycopy(this.n5, 0, var1.n5, 0, this.n5.length);
         return var1;
      } catch (CloneNotSupportedException var3) {
         throw new InternalError();
      }
   }

   @Override
   public boolean equals(Object other) {
      if (other != null && other instanceof a6) {
         a6 var2 = (a6)other;
         int var3 = Math.min(this.n5.length, var2.n5.length);

         for (int var4 = 0; var4 < var3; var4++) {
            if (this.n5[var4] != var2.n5[var4]) {
               return false;
            }
         }

         if (this.n5.length > var3) {
            for (int var5 = var3 + 1; var5 < this.n5.length; var5++) {
               if (this.n5[var5] != 0L) {
                  return false;
               }
            }
         } else if (var2.n5.length > var3) {
            for (int var6 = var3 + 1; var6 < var2.n5.length; var6++) {
               if (var2.n5[var6] != 0L) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean u3(int var1) {
      if (var1 < 0) {
         return false;
      }

      int var2 = t2(var1);
      return var2 >= this.n5.length ? false : (this.n5[var2] & h0(var1)) != 0L;
   }

   public void a6(int var1) {
      int var2 = t2(var1);
      if (var2 < this.n5.length) {
         this.n5[var2] = this.n5[var2] & ~h0(var1);
      }
   }

   private final int c8(int var1) {
      return (var1 >> 6) + 1;
   }

   private static final int t2(int var0) {
      return var0 >> 6;
   }

   @Override
   public String toString() {
      return this.n5((String[])null);
   }

   public String n5(String[] var1) {
      StringBuffer var2 = new StringBuffer();
      String var3 = ",";
      boolean var4 = false;
      var2.append('{');

      for (int var5 = 0; var5 < this.n5.length << 6; var5++) {
         if (this.u3(var5)) {
            if (var5 > 0 && var4) {
               var2.append(var3);
            }

            if (var1 != null) {
               var2.append(var1[var5]);
            } else {
               var2.append(var5);
            }

            var4 = true;
         }
      }

      var2.append('}');
      return var2.toString();
   }
}
