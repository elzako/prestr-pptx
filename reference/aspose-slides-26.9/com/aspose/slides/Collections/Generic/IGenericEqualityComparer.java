package com.aspose.slides.Collections.Generic;

public interface IGenericEqualityComparer<T> {
   boolean equalsT(T var1, T var2);

   int hashCodeT(T var1);

   boolean equals(Object var1, Object var2);

   int hashCode(Object var1);
}
