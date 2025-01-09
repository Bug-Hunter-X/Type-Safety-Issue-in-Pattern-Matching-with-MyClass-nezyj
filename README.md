# Scala Type Safety Issue in Pattern Matching

This example demonstrates a common type safety issue in Scala that can arise when using pattern matching with `asInstanceOf`.  The `MyClass` attempts to handle different types, but `asInstanceOf` circumvents the type system's safety checks, potentially causing runtime exceptions.