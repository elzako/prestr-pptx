package com.aspose.slides.internal.v6g;

import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.c4;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.i6;
import com.aspose.slides.ms.System.k8;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.y8;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class k5 {
   private static final HashSet<Class<?>> n5 = new HashSet<>();
   private static final HashMap<Class<?>, Constructor<?>> l6 = new HashMap<>();
   private static final HashMap<Class, t2> k5 = new HashMap<>();

   public static <T> T n5(Object var0, Class<T> var1) {
      if (var0 == null) {
         return null;
      } else if (var1 == null) {
         throw new IllegalStateException("type can't be null");
      } else if (var1 == com.aspose.slides.ms.System.u3.class) {
         return (T)l6(var0);
      } else if (var1.isArray()) {
         return (T)a6(var0, var1);
      } else if (!var1.isPrimitive() && com.aspose.slides.internal.t9p.n5.l6(var1) == null) {
         return (T)(var1.isInstance(var0) ? var0 : null);
      } else {
         throw new IllegalStateException("reference type or nullable type required");
      }
   }

   private static com.aspose.slides.ms.System.u3 l6(Object var0) {
      if (com.aspose.slides.ms.System.u3.class.isInstance(var0)) {
         return (com.aspose.slides.ms.System.u3)var0;
      } else {
         return var0.getClass().isArray() ? com.aspose.slides.ms.System.u3.n5((Object)(var0)) : null;
      }
   }

   private static boolean k5(Object var0) {
      return com.aspose.slides.ms.System.u3.class.isInstance(var0) || var0.getClass().isArray();
   }

   private static Object a6(Object var0, Class var1) {
      if (com.aspose.slides.ms.System.u3.class.isInstance(var0)) {
         var0 = com.aspose.slides.ms.System.u3.n5((com.aspose.slides.ms.System.u3)var0);
      }

      return var0.getClass().isArray() && var1.isInstance(var0) ? var0 : null;
   }

   private static boolean u9(Object var0, Class var1) {
      if (com.aspose.slides.ms.System.u3.class.isInstance(var0)) {
         var0 = com.aspose.slides.ms.System.u3.n5((com.aspose.slides.ms.System.u3)var0);
      }

      return var0.getClass().isArray() && var1.isInstance(var0);
   }

   public static <T> boolean l6(Object var0, Class<T> var1) {
      if (var0 == null) {
         return false;
      }

      if (var1 == null) {
         throw new IllegalStateException("type can't be null");
      }

      if (var1 == com.aspose.slides.ms.System.u3.class) {
         return k5(var0);
      }

      if (var1.isArray()) {
         return u9(var0, var1);
      }

      Class var2 = var1.isPrimitive() ? com.aspose.slides.internal.t9p.n5.n5(var1) : var1;
      return var2.isInstance(var0);
   }

   public static boolean n5(Iterator var0, Class<IDisposable> var1) {
      return var1.isInstance(var0);
   }

   public static byte n5(int var0) {
      switch (var0) {
         case 3:
            return 1;
         case 4:
            return 2;
         case 5:
         case 6:
            return 1;
         case 7:
            return 2;
         case 8:
            throw new NotImplementedException();
         case 9:
            return 4;
         case 10:
            throw new NotImplementedException();
         case 11:
         case 12:
            return 8;
         case 13:
            return 4;
         case 14:
            return 8;
         case 15:
            throw new NotImplementedException();
         default:
            throw new NotImplementedException();
      }
   }

   public static <T> T k5(Object var0, Class<T> var1) {
      if (var0 == null) {
         if (n5(var1).y1()) {
            throw new IllegalStateException("Value type object can't be null");
         } else {
            return null;
         }
      } else if (var1 == null) {
         throw new IllegalStateException("type can't be null");
      } else if (var1.equals(com.aspose.slides.ms.System.u3.class) && var0.getClass().isArray()) {
         return (T)com.aspose.slides.ms.System.u3.n5(var0);
      } else {
         return (T)(var1.isArray() && var0 instanceof com.aspose.slides.ms.System.u3
            ? com.aspose.slides.ms.System.u3.n5((com.aspose.slides.ms.System.u3)var0)
            : var0);
      }
   }

   public static byte n5(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return (byte)((Character)var0).charValue();
         case 5:
         case 6:
            return (Byte)var0;
         case 7:
            return ((Short)var0).byteValue();
         case 8:
            return (byte)((Integer)var0 & 0xFF);
         case 9:
            return ((Integer)var0).byteValue();
         case 10:
            return (byte)((Long)var0 & 255L);
         case 11:
            return ((Long)var0).byteValue();
         case 12:
            return ((Long)var0).byteValue();
         case 13:
            float var2 = (Float)var0;
            if (!n1.l6(var2) && !n1.k5(var2)) {
               if (var2 > 2.1474836E9F) {
                  return 0;
               }

               return (byte)((long)var2 & 255L);
            }

            return 0;
         case 14:
            double var3 = (Double)var0;
            if (!d2.k5(var3) && !d2.l6(var3)) {
               if (var3 >= 9.223372E18F) {
                  return 0;
               }

               return (byte)(Double.valueOf(var3).longValue() & 255L);
            }

            return 0;
         case 15:
            return c4.n3(((c4)var0).l6());
      }
   }

   public static short l6(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return (short)((Character)var0).charValue();
         case 5:
            return ((Byte)var0).shortValue();
         case 6:
            return (short)((Byte)var0 & 0xFF);
         case 7:
            return (Short)var0;
         case 8:
            return (short)((Integer)var0 & 65535);
         case 9:
            return ((Integer)var0).shortValue();
         case 10:
            return (short)((Long)var0 & 65535L);
         case 11:
            return ((Long)var0).shortValue();
         case 12:
            return ((Long)var0).shortValue();
         case 13:
            float var2 = (Float)var0;
            if (!n1.l6(var2) && !n1.k5(var2)) {
               if (var2 > 2.1474836E9F) {
                  return 0;
               }

               return (short)((long)var2 & 65535L);
            }

            return 0;
         case 14:
            double var3 = (Double)var0;
            if (!d2.k5(var3) && !d2.l6(var3)) {
               if (var3 > 2.147483647E9) {
                  return 0;
               }

               return (short)var3;
            }

            return 0;
         case 15:
            return c4.e2(((c4)var0).l6());
      }
   }

   public static int k5(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return (Character)var0;
         case 5:
            return ((Byte)var0).intValue() & 65535;
         case 6:
            return (Byte)var0 & 0xFF;
         case 7:
            return (Short)var0 & 65535;
         case 8:
            return (Integer)var0 & 65535;
         case 9:
            return (Integer)var0 & 65535;
         case 10:
            return ((Long)var0).intValue() & 65535;
         case 11:
            return ((Long)var0).intValue() & 65535;
         case 12:
            return ((Long)var0).intValue() & 65535;
         case 13:
            float var2 = (Float)var0;
            if (!n1.l6(var2) && !n1.k5(var2)) {
               if (var2 > 2.1474836E9F) {
                  return 0;
               }

               return (int)((long)var2 & 65535L);
            }

            return 0;
         case 14:
            double var3 = (Double)var0;
            if (!d2.k5(var3) && !d2.l6(var3)) {
               if (var3 >= 9.223372E18F) {
                  return 0;
               }

               return (int)((long)var3 & 65535L);
            }

            return 0;
         case 15:
            return c4.t9(((c4)var0).l6());
      }
   }

   public static int u3(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return (Character)var0;
         case 5:
            return ((Byte)var0).intValue();
         case 6:
            return (Byte)var0 & 0xFF;
         case 7:
            return ((Short)var0).intValue();
         case 8:
            return (Integer)var0 & 65535;
         case 9:
            return (Integer)var0;
         case 10:
            return (int)((Long)var0 & 4294967295L);
         case 11:
            return ((Long)var0).intValue();
         case 12:
            return ((Long)var0).intValue();
         case 13:
            float var2 = (Float)var0;
            if (!n1.l6(var2) && !n1.k5(var2)) {
               Double var3 = var2 > 0.0F ? Math.floor(var2) : Math.ceil(var2);
               if (var3 >= -2.147483647E9 && var3 <= 2.147483647E9) {
                  return var3.intValue();
               }

               return Integer.MIN_VALUE;
            }

            return Integer.MIN_VALUE;
         case 14:
            double var4 = (Double)var0;
            if (!d2.l6(var4) && !d2.k5(var4)) {
               Double var6 = var4 > 0.0 ? Math.floor(var4) : Math.ceil(var4);
               if (var6 >= -2.147483647E9 && var6 <= 2.147483647E9) {
                  return var6.intValue();
               }

               return Integer.MIN_VALUE;
            }

            return Integer.MIN_VALUE;
         case 15:
            return c4.z1(((c4)var0).l6());
      }
   }

   public static long a6(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return ((Character)var0).charValue();
         case 5:
            return ((Byte)var0).longValue() & 4294967295L;
         case 6:
            return (Byte)var0 & 0xFF;
         case 7:
            return ((Short)var0).longValue() & 4294967295L;
         case 8:
            return ((Integer)var0).longValue() & 4294967295L;
         case 9:
            return ((Integer)var0).longValue() & 4294967295L;
         case 10:
            return (Long)var0 & 4294967295L;
         case 11:
            return (Long)var0 & 4294967295L;
         case 12:
            return (Long)var0 & 4294967295L;
         case 13:
            float var2 = (Float)var0;
            if (!n1.l6(var2) && !n1.k5(var2)) {
               Double var3 = var2 > 0.0F ? Math.floor(var2) : Math.ceil(var2);
               if (var3 >= -4.294967295E9 && var3 <= 4.294967295E9) {
                  return var3.longValue() & 4294967295L;
               }

               return 0L;
            }

            return 0L;
         case 14:
            double var4 = (Double)var0;
            if (!d2.k5(var4) && !d2.l6(var4)) {
               if (var4 >= 9.223372E18F) {
                  return 0L;
               }

               return (long)var4 & 4294967295L;
            }

            return 0L;
         case 15:
            return c4.t4(((c4)var0).l6()) & 4294967295L;
      }
   }

   public static long u9(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return ((Character)var0).charValue();
         case 5:
            return ((Byte)var0).longValue();
         case 6:
            return (Byte)var0 & 0xFF;
         case 7:
            return ((Short)var0).longValue();
         case 8:
            return (Integer)var0 & 65535;
         case 9:
            return ((Integer)var0).longValue();
         case 10:
            return (Long)var0 & 4294967295L;
         case 11:
            return (Long)var0;
         case 12:
            return (Long)var0;
         case 13:
            float var2 = (Float)var0;
            if (!n1.l6(var2) && !n1.k5(var2)) {
               Double var3 = var2 > 0.0F ? Math.floor(var2) : Math.ceil(var2);
               if (var3 >= -9.223372E18F && var3 < 9.223372E18F) {
                  return var3.longValue();
               }

               return Long.MIN_VALUE;
            }

            return Long.MIN_VALUE;
         case 14:
            double var4 = (Double)var0;
            if (!d2.l6(var4) && !d2.k5(var4)) {
               Double var6 = var4 > 0.0 ? Math.floor(var4) : Math.ceil(var4);
               if (var6 > -9.223372E18F && var6 < 9.223372E18F) {
                  return var6.longValue();
               }

               return Long.MIN_VALUE;
            }

            return Long.MIN_VALUE;
         case 15:
            return c4.q0(((c4)var0).l6());
      }
   }

   public static long h0(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return ((Character)var0).charValue();
         case 5:
            return ((Byte)var0).longValue();
         case 6:
            return (Byte)var0 & 0xFF;
         case 7:
            return ((Short)var0).longValue();
         case 8:
            return ((Integer)var0).longValue();
         case 9:
            return ((Integer)var0).longValue();
         case 10:
            return (Long)var0;
         case 11:
            return (Long)var0;
         case 12:
            return (Long)var0;
         case 13:
            float var2 = (Float)var0;
            if (n1.a6(var2)) {
               return 0L;
            } else {
               if (!n1.k5(var2) && !n1.u3(var2)) {
                  Double var3 = var2 > 0.0F ? Math.floor(var2) : Math.ceil(var2);
                  if (var3 <= -9.223372E18F) {
                     return Long.MIN_VALUE;
                  }

                  if (var3 == 9.223372E18F) {
                     return Long.MIN_VALUE;
                  }

                  if (var3 > 9.223372E18F) {
                     return 0L;
                  }

                  return var3.longValue();
               }

               return Long.MIN_VALUE;
            }
         case 14:
            double var4 = (Double)var0;
            if (d2.a6(var4)) {
               return 0L;
            } else {
               if (!d2.k5(var4) && !d2.u3(var4)) {
                  Double var6 = var4 > 0.0 ? Math.floor(var4) : Math.ceil(var4);
                  if (var6 <= -9.223372E18F) {
                     return Long.MIN_VALUE;
                  }

                  if (var6 == 9.223372E18F) {
                     return Long.MIN_VALUE;
                  }

                  if (var6 > 9.223372E18F) {
                     return 0L;
                  }

                  return var6.longValue();
               }

               return Long.MIN_VALUE;
            }
         case 15:
            return c4.z3(((c4)var0).l6());
      }
   }

   public static float c8(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return ((Character)var0).charValue();
         case 5:
            return ((Byte)var0).floatValue();
         case 6:
            return (Byte)var0 & 0xFF;
         case 7:
            return ((Short)var0).floatValue();
         case 8:
            return (Integer)var0 & 65535;
         case 9:
            return ((Integer)var0).floatValue();
         case 10:
            return (float)((Long)var0 & 4294967295L);
         case 11:
            return ((Long)var0).floatValue();
         case 12:
            return new i6((Long)var0).floatValue();
         case 13:
            return (Float)var0;
         case 14:
            return ((Double)var0).floatValue();
         case 15:
            return c4.m1(((c4)var0).l6());
      }
   }

   public static double t2(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return ((Character)var0).charValue();
         case 5:
            return ((Byte)var0).doubleValue();
         case 6:
            return (Byte)var0 & 0xFF;
         case 7:
            return ((Short)var0).doubleValue();
         case 8:
            return (Integer)var0 & 65535;
         case 9:
            return ((Integer)var0).doubleValue();
         case 10:
            return (Long)var0 & 4294967295L;
         case 11:
            return ((Long)var0).doubleValue();
         case 12:
            return new i6((Long)var0).doubleValue();
         case 13:
            return ((Float)var0).doubleValue();
         case 14:
            return (Double)var0;
         case 15:
            return c4.y4(((c4)var0).l6());
      }
   }

   public static c4 s7(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return c4.n5((Character)var0);
         case 5:
            return c4.l6((Byte)var0);
         case 6:
            return c4.n5((Byte)var0);
         case 7:
            return c4.n5((Short)var0);
         case 8:
            return c4.l6((Integer)var0);
         case 9:
            return c4.k5((Integer)var0);
         case 10:
            return c4.u3((Long)var0);
         case 11:
            return c4.a6((Long)var0);
         case 12:
            return c4.u9((Long)var0);
         case 13:
            return c4.l6((Float)var0);
         case 14:
            return c4.l6((Double)var0);
         case 15:
            return ((c4)var0).l6();
      }
   }

   public static char x8(Object var0, int var1) {
      switch (var1) {
         case 1:
         case 2:
         case 3:
         default:
            throw new InvalidCastException();
         case 4:
            return (Character)var0;
         case 5:
            return (char)((Byte)var0).intValue();
         case 6:
            return (char)((Byte)var0 & 0xFF);
         case 7:
            return (char)((Short)var0 & 65535);
         case 8:
            return (char)((Integer)var0).intValue();
         case 9:
            return (char)((Integer)var0).intValue();
         case 10:
            return (char)((Long)var0).intValue();
         case 11:
            return (char)((Long)var0).intValue();
         case 12:
            return (char)((Long)var0).intValue();
         case 13:
            float var2 = (Float)var0;
            if (!n1.k5(var2) && !n1.l6(var2)) {
               if (var2 > 4.2949673E9F) {
                  return '\u0000';
               }

               return (char)(Float.valueOf(var2).longValue() & 65535L);
            }

            return '\u0000';
         case 14:
            double var3 = (Double)var0;
            if (!d2.k5(var3) && !d2.l6(var3)) {
               if (var3 >= 9.223372E18F) {
                  return '\u0000';
               }

               return (char)(Double.valueOf(var3).longValue() & 65535L);
            }

            return '\u0000';
         case 15:
            return c4.a6(((c4)var0).l6());
      }
   }

   public static Object n5(Object var0) {
      return var0 instanceof k8 ? ((k8)var0).Clone() : var0;
   }

   public static Boolean n5(boolean var0) {
      return var0;
   }

   public static Character n5(char var0) {
      return var0;
   }

   public static Byte n5(byte var0) {
      return var0;
   }

   public static Integer l6(int var0) {
      return var0;
   }

   public static Long n5(long var0) {
      return var0;
   }

   public static Float n5(float var0) {
      return var0;
   }

   public static Double n5(double var0) {
      return var0;
   }

   public static <T> T u3(Object var0, Class<T> var1) {
      if (var0 == null) {
         throw new NullReferenceException();
      }

      try {
         return (T)var0;
      } catch (ClassCastException var3) {
         throw new InvalidCastException(var3.getMessage());
      }
   }

   public static y8 n5(Class<?> var0) {
      return com.aspose.slides.internal.p4l.d2.n5(var0);
   }

   public static <T> T l6(Class<T> var0) {
      if (var0.equals(byte.class) || var0.equals(Byte.class)) {
         return (T)(new Byte((byte)0));
      }

      if (var0.equals(short.class) || var0.equals(Short.class)) {
         return (T)(new Short((short)0));
      }

      if (var0.equals(int.class) || var0.equals(Integer.class)) {
         return (T)(new Integer(0));
      }

      if (var0.equals(long.class) || var0.equals(Long.class)) {
         return (T)(new Long(0L));
      }

      if (var0.equals(char.class) || var0.equals(Character.class)) {
         return (T)(new Character('\u0000'));
      }

      if (var0.equals(boolean.class) || var0.equals(Boolean.class)) {
         return (T)Boolean.FALSE;
      }

      if (var0.equals(float.class) || var0.equals(Float.class)) {
         return (T)(new Float(0.0));
      }

      if (var0.equals(double.class) || var0.equals(Double.class)) {
         return (T)(new Double(0.0));
      }

      if (var0.equals(c4.class)) {
         return (T)c4.a6.l6();
      }

      boolean var1 = false;
      synchronized (n5) {
         var1 = n5.contains(var0);
      }

      if (!var1) {
         try {
            Class.forName(var0.getName());
         } catch (Exception var7) {
         }

         synchronized (n5) {
            n5.add(var0);
         }
      }

      try {
         t2 var11 = a6(var0);
         if (var11 != null) {
            return (T)var11.l6();
         }

         Constructor var3 = u3(var0);
         if (var3 == null) {
            var3 = var0.getConstructor();
            if (var3 != null) {
               n5(var0, var3);
            }
         }

         return (T)(var3 != null ? var3.newInstance() : var0.newInstance());
      } catch (Exception var5) {
         throw new RuntimeException(var5);
      }
   }

   public static <T> Object n5(Class<T> var0, int... var1) {
      return com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(n5(var0), var1));
   }

   public static <T> Object k5(Class<T> var0) {
      if (var0.equals(byte.class) || var0.equals(Byte.class)) {
         return (byte)0;
      }

      if (var0.equals(short.class) || var0.equals(Short.class)) {
         return (short)0;
      }

      if (var0.equals(int.class) || var0.equals(Integer.class)) {
         return 0;
      }

      if (var0.equals(long.class) || var0.equals(Long.class)) {
         return 0L;
      }

      if (var0.equals(char.class) || var0.equals(Character.class)) {
         return '\u0000';
      }

      if (var0.equals(boolean.class) || var0.equals(Boolean.class)) {
         return false;
      }

      if (var0.equals(float.class) || var0.equals(Float.class)) {
         return 0.0F;
      }

      if (var0.equals(double.class) || var0.equals(Double.class)) {
         return 0.0;
      }

      if (var0.equals(c4.class)) {
         return c4.a6.l6();
      }

      if (h0.class.isAssignableFrom(var0)) {
         boolean var1 = false;
         synchronized (n5) {
            var1 = n5.contains(var0);
         }

         if (!var1) {
            try {
               Class.forName(var0.getName());
            } catch (Exception var7) {
            }

            synchronized (n5) {
               n5.add(var0);
            }
         }

         try {
            t2 var11 = a6(var0);
            if (var11 != null) {
               return var11.l6();
            }

            Constructor var3 = u3(var0);
            if (var3 == null) {
               var3 = var0.getConstructor();
               if (var3 != null) {
                  n5(var0, var3);
               }
            }

            return var3 != null ? var3.newInstance() : var0.newInstance();
         } catch (Exception var5) {
            throw new RuntimeException(var5);
         }
      } else {
         return null;
      }
   }

   public static <T> T n5(T var0, T var1) {
      return (T)(var0 != null ? var0 : var1);
   }

   private static <T> Constructor<T> u3(Class<T> var0) {
      synchronized (l6) {
         return (Constructor<T>)l6.get(var0);
      }
   }

   private static <T> void n5(Class<T> var0, Constructor<T> var1) {
      synchronized (l6) {
         l6.put(var0, var1);
      }
   }

   private static t2 a6(Class<?> var0) {
      synchronized (k5) {
         return k5.get(var0);
      }
   }

   public static <T> void n5(Class<T> var0, t2<T> var1) {
      synchronized (k5) {
         k5.put(var0, var1);
      }
   }
}
