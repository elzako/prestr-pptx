package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.ArgumentException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class a6 {
   private Object n5;
   private a6$n5 l6;
   private ByteBuffer k5;
   private int u3;
   private int a6;
   private int u9;

   private a6(Object var1, int var2, int var3, a6$n5 var4, int var5) {
      this.n5 = var1;
      this.l6 = var4;
      this.u3 = var5;
      n5(var1, var2, var3, var5);
      this.a6 = var2 / var5;
      this.u9 = (var2 + var3 - 1) / var5;
      this.k5 = ByteBuffer.allocate(this.u3());
      this.k5.order(ByteOrder.LITTLE_ENDIAN);
      this.n5(var1, var4);
   }

   public static void n5(Object var0, int var1, int var2, int var3) {
      if (var1 > Array.getLength(var0) * var3 - var2) {
         throw new ArgumentException("Offset or count were out of bounds");
      }
   }

   private void n5(Object var1, a6$n5 var2) {
      switch (var2) {
         case BooleanPrimitive:
            boolean[] var3 = (boolean[])var1;

            for (int var32 = this.a6; var32 <= this.u9; var32++) {
               this.k5.put((byte)(var3[var32] ? 1 : 0));
            }
            break;
         case BooleanObject:
            Boolean[] var4 = (Boolean[])var1;

            for (int var33 = this.a6; var33 <= this.u9; var33++) {
               this.k5.put((byte)(var4[var33] ? 1 : 0));
            }
            break;
         case BytePrimitive:
            byte[] var5 = (byte[])var1;

            for (int var34 = this.a6; var34 <= this.u9; var34++) {
               this.k5.put(var5[var34]);
            }
            break;
         case ByteObject:
            Byte[] var6 = (Byte[])var1;

            for (int var35 = this.a6; var35 <= this.u9; var35++) {
               this.k5.put(var6[var35]);
            }
            break;
         case ShortPrimitive:
            ShortBuffer var7 = this.k5.asShortBuffer();
            short[] var8 = (short[])var1;

            for (int var36 = this.a6; var36 <= this.u9; var36++) {
               var7.put(var8[var36]);
            }
            break;
         case ShortObject:
            ShortBuffer var9 = this.k5.asShortBuffer();
            Short[] var10 = (Short[])var1;

            for (int var37 = this.a6; var37 <= this.u9; var37++) {
               var9.put(var10[var37]);
            }
            break;
         case CharPrimitive:
            CharBuffer var11 = this.k5.asCharBuffer();
            char[] var12 = (char[])var1;

            for (int var38 = this.a6; var38 <= this.u9; var38++) {
               var11.put(var12[var38]);
            }
            break;
         case CharObject:
            CharBuffer var13 = this.k5.asCharBuffer();
            Character[] var14 = (Character[])var1;

            for (int var39 = this.a6; var39 <= this.u9; var39++) {
               var13.put(var14[var39]);
            }
            break;
         case IntPrimitive:
            IntBuffer var15 = this.k5.asIntBuffer();
            int[] var16 = (int[])var1;

            for (int var40 = this.a6; var40 <= this.u9; var40++) {
               var15.put(var16[var40]);
            }
            break;
         case IntObject:
            IntBuffer var17 = this.k5.asIntBuffer();
            Integer[] var18 = (Integer[])var1;

            for (int var41 = this.a6; var41 <= this.u9; var41++) {
               var17.put(var18[var41]);
            }
            break;
         case FloatPrimitive:
            FloatBuffer var19 = this.k5.asFloatBuffer();
            float[] var20 = (float[])var1;

            for (int var42 = this.a6; var42 <= this.u9; var42++) {
               var19.put(var20[var42]);
            }
            break;
         case FloatObject:
            FloatBuffer var21 = this.k5.asFloatBuffer();
            Float[] var22 = (Float[])var1;

            for (int var43 = this.a6; var43 <= this.u9; var43++) {
               var21.put(var22[var43]);
            }
            break;
         case LongPrimitive:
            LongBuffer var23 = this.k5.asLongBuffer();
            long[] var24 = (long[])var1;

            for (int var44 = this.a6; var44 <= this.u9; var44++) {
               var23.put(var24[var44]);
            }
            break;
         case LongObject:
            LongBuffer var25 = this.k5.asLongBuffer();
            Long[] var26 = (Long[])var1;

            for (int var45 = this.a6; var45 <= this.u9; var45++) {
               var25.put(var26[var45]);
            }
            break;
         case DoublePrimitive:
            DoubleBuffer var27 = this.k5.asDoubleBuffer();
            double[] var28 = (double[])var1;

            for (int var46 = this.a6; var46 <= this.u9; var46++) {
               var27.put(var28[var46]);
            }
            break;
         case DoubleObject:
            DoubleBuffer var29 = this.k5.asDoubleBuffer();
            Double[] var30 = (Double[])var1;

            for (int var31 = this.a6; var31 <= this.u9; var31++) {
               var29.put(var30[var31]);
            }
            break;
         default:
            throw new ArgumentException("Object must be an array of primitive.");
      }
   }

   public void n5() {
      ((Buffer)this.k5).position(0);
      switch (this.l6) {
         case BooleanPrimitive:
            boolean[] var1 = (boolean[])this.n5;

            for (int var30 = this.a6; var30 <= this.u9; var30++) {
               var1[var30] = this.k5.get() != 0;
            }
            break;
         case BooleanObject:
            Boolean[] var2 = (Boolean[])this.n5;

            for (int var31 = this.a6; var31 <= this.u9; var31++) {
               var2[var31] = this.k5.get() != 0;
            }
            break;
         case BytePrimitive:
            byte[] var3 = (byte[])this.n5;

            for (int var32 = this.a6; var32 <= this.u9; var32++) {
               var3[var32] = this.k5.get();
            }
            break;
         case ByteObject:
            Byte[] var4 = (Byte[])this.n5;

            for (int var33 = this.a6; var33 <= this.u9; var33++) {
               var4[var33] = this.k5.get();
            }
            break;
         case ShortPrimitive:
            ShortBuffer var5 = this.k5.asShortBuffer();
            short[] var6 = (short[])this.n5;

            for (int var34 = this.a6; var34 <= this.u9; var34++) {
               var6[var34] = var5.get();
            }
            break;
         case ShortObject:
            ShortBuffer var7 = this.k5.asShortBuffer();
            Short[] var8 = (Short[])this.n5;

            for (int var35 = this.a6; var35 <= this.u9; var35++) {
               var8[var35] = var7.get();
            }
            break;
         case CharPrimitive:
            CharBuffer var9 = this.k5.asCharBuffer();
            char[] var10 = (char[])this.n5;

            for (int var36 = this.a6; var36 <= this.u9; var36++) {
               var10[var36] = var9.get();
            }
            break;
         case CharObject:
            CharBuffer var11 = this.k5.asCharBuffer();
            Character[] var12 = (Character[])this.n5;

            for (int var37 = this.a6; var37 <= this.u9; var37++) {
               var12[var37] = var11.get();
            }
            break;
         case IntPrimitive:
            IntBuffer var13 = this.k5.asIntBuffer();
            int[] var14 = (int[])this.n5;

            for (int var38 = this.a6; var38 <= this.u9; var38++) {
               var14[var38] = var13.get();
            }
            break;
         case IntObject:
            IntBuffer var15 = this.k5.asIntBuffer();
            Integer[] var16 = (Integer[])this.n5;

            for (int var39 = this.a6; var39 <= this.u9; var39++) {
               var16[var39] = var15.get();
            }
            break;
         case FloatPrimitive:
            FloatBuffer var17 = this.k5.asFloatBuffer();
            float[] var18 = (float[])this.n5;

            for (int var40 = this.a6; var40 <= this.u9; var40++) {
               var18[var40] = var17.get();
            }
            break;
         case FloatObject:
            FloatBuffer var19 = this.k5.asFloatBuffer();
            Float[] var20 = (Float[])this.n5;

            for (int var41 = this.a6; var41 <= this.u9; var41++) {
               var20[var41] = var19.get();
            }
            break;
         case LongPrimitive:
            LongBuffer var21 = this.k5.asLongBuffer();
            long[] var22 = (long[])this.n5;

            for (int var42 = this.a6; var42 <= this.u9; var42++) {
               var22[var42] = var21.get();
            }
            break;
         case LongObject:
            LongBuffer var23 = this.k5.asLongBuffer();
            Long[] var24 = (Long[])this.n5;

            for (int var43 = this.a6; var43 <= this.u9; var43++) {
               var24[var43] = var23.get();
            }
            break;
         case DoublePrimitive:
            DoubleBuffer var25 = this.k5.asDoubleBuffer();
            double[] var26 = (double[])this.n5;

            for (int var44 = this.a6; var44 <= this.u9; var44++) {
               var26[var44] = var25.get();
            }
            break;
         case DoubleObject:
            DoubleBuffer var27 = this.k5.asDoubleBuffer();
            Double[] var28 = (Double[])this.n5;

            for (int var29 = this.a6; var29 <= this.u9; var29++) {
               var28[var29] = var27.get();
            }
            break;
         default:
            throw new ArgumentException("Object must be an array of primitive.");
      }
   }

   public static a6 n5(Object var0, int var1, int var2, a6$n5 var3, int var4) {
      return new a6(var0, var1, var2, var3, var4);
   }

   public ByteBuffer l6() {
      return this.k5;
   }

   public int k5() {
      return this.a6 * this.u3;
   }

   public int u3() {
      return (this.u9 - this.a6 + 1) * this.u3;
   }

   public static Class<?> n5(Object var0) {
      Class var1 = var0.getClass();
      if (!var1.isArray()) {
         throw new ArgumentException("Object must be an array.");
      } else {
         return var1.getComponentType();
      }
   }

   public static a6$n5 n5(Class<?> var0) {
      return a6$n5.n5(var0);
   }

   public static int n5(a6$n5 var0) {
      switch (var0) {
         case BooleanPrimitive:
         case BooleanObject:
         case BytePrimitive:
         case ByteObject:
            return 1;
         case ShortPrimitive:
         case ShortObject:
         case CharPrimitive:
         case CharObject:
            return 2;
         case IntPrimitive:
         case IntObject:
         case FloatPrimitive:
         case FloatObject:
            return 4;
         case LongPrimitive:
         case LongObject:
         case DoublePrimitive:
         case DoubleObject:
            return 8;
         default:
            throw new ArgumentException("Object must be an array of primitive.");
      }
   }
}
